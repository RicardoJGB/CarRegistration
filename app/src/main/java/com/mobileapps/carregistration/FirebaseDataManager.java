package com.mobileapps.carregistration;

import android.support.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class FirebaseDataManager {

    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;
    private final DatabaseReference carReference;

    public FirebaseDataManager (){
        firebaseDatabase =FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference("simpleData");
        carReference= firebaseDatabase.getReference("people");
    }

    public void uploadSimpleData (String simpleData){
        databaseReference.setValue(simpleData);
    }

    public void downloadSimpleData(final SimpleCallback simpleCallback){

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String simpleData = dataSnapshot.getValue(String.class);
                simpleCallback.onSimpleDataChange(simpleData);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    public void uploadPerson (Car car){
        carReference
                .push()
                .setValue(car);
    }

    public void downloadPeople (final PeopleCallback callback){
        carReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                List<Car> cars = new ArrayList<>();
                for (DataSnapshot snapshot : dataSnapshot.getChildren()){
                    cars.add(snapshot.getValue(Car.class));
                }

                callback.onPeopleDataChange(cars);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    interface SimpleCallback {
        void onSimpleDataChange (String simpleData);
    }

    interface PeopleCallback {

        void onPeopleDataChange (List<Person> personList);
    }
}
}
