package cJavaDesignPatterns;
//Immutable Object Pattern
//Immutable Object Pattern ensures that once an object is created, its state cannot be modified.
//Because of this, there are no setter methods
//all fields are both private and final
//Immutable objects can be copied to new immutable objects

class DatabaseConnection {
    //private instance of a classs
    private static DatabaseConnection instance;

    //private constructor to prevent instantiation from other classes

    private DatabaseConnection(){};

    //public method to provide access to the single instance

    public static DatabaseConnection getInstance(){
        if(instance==null){
            instance = new DatabaseConnection();
        }

        return instance;
    }

}

public class SingletonPattern {
    public static void main(String[] args) {
        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        DatabaseConnection connection3 = DatabaseConnection.getInstance();

        System.out.println(connection1==connection2);


    }

}
