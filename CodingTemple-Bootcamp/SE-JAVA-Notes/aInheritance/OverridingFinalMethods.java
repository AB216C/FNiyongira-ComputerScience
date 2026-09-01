package aInheritance;

class ParentNext {
    public final void showMessage(){
        System.out.println("This is a final method in parent class");
    }
}


//Trying to override final method will cause compiler errors

class ChildNext extends ParentNext {
//
//    public void showMessage() {
//        System.out.println("This is overridden method in child class");
//    }

}

//Final method is not overridden
//uncommenting showMessage method will cause a compiler errors


