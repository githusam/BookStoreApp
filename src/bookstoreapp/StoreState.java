package bookstoreapp;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Husam
 */
public abstract class StoreState {
    protected Store store;
    
    public StoreState(Store store){
        this.store = store;
    }
}
