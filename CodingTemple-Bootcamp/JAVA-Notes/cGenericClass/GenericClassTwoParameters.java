package cGenericClass;
//Generic classes can have multiple Generic parameters
class Pair<K,V>{
    private K key;
    private V value;

    //constructor
    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    //getter for key
    public K getKey(){
     return key;
    }

    //Setter for key
    public void setKey(K key){
        this.key = key;
    }


    //getter for value
    public V getValue(){
        return value;
    }

    //setter for value
    public void setValue(V value){
        this.value = value;
    }

    @Override

    public String toString(){
        return "Pair:{" + "Key= " + key + ", Value= "+value+"}";
    }

}
public class GenericClassTwoParameters {
    public static void main(String[] args) {
        //Create a pair with Integer Key and String value

        Pair<Integer,String> pair1 = new Pair<>(234,"Hello");
        System.out.println(pair1);

        Pair<Double,String> pair2 = new Pair<>(23.3,"Amigos");
        System.out.println(pair2);
    }
}
