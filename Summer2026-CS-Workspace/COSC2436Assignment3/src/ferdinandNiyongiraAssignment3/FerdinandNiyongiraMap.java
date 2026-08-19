package ferdinandNiyongiraAssignment3;

public interface FerdinandNiyongiraMap<K,V> {
	/**Remove all entries from this map*/
	
	public void ferdinandNiyongiraClear();
	
	/**Return true if the specified key is in the map*/
	
	public boolean ferdinandNiyongiraContainsKey(K key);
	
	/**Return true if this map contains the specified value*/
	
	public boolean ferdinandNiyongiraContainsValue(V value);
	
	/**Return a set of entries in the map*/
	
	public java.util.Set<FerdinandNiyongiraEntry<K,V>>ferdinandNiyongiraEntrySet();
	
	/**Return the first value that matches specified value*/
	
	public V ferdinandNiyongiraGet(K key);
	
	/**Return true if this map contains no entries*/
	
	public boolean ferdinandNiyongiraIsEmpty();
	
	/**Return a set consist of the keys in this map*/
	
	public java.util.Set<K> ferdinandNiyongiraKeySet();
	
	/**Add an entry(key, value) into the map*/
	
	public V ferdinandNiyongiraPut(K key, V value);
	
	/**Remove the entries for the specified key */
	
	public void ferdinandNiyongiraRemove(K key);
	
	/**Return the number of mappings in this map*/
	
	public int ferdinandNiyongiraSize();
	
	/**Return a set consist of the values in this map */
	
	public java.util.Set<V> ferdinandNiyongiraValues();
	
	/**Define inner class for Entry*/
	
	public static class FerdinandNiyongiraEntry<K,V> 
	{
		// Store the key associated with this entry.
		K key;
	
		// Store the value associated with this entry.
		V value;
		
		public FerdinandNiyongiraEntry(K key, V value) 
		{
			// Initialize the key for this entry.
			this.key = key;
	
			// Initialize the value for this entry.
			this.value = value;
		}
		
		public K getKey() 
		{
			// Return the key stored in this entry.
			return key;
		}
		
		public V getValue() 
		{
			// Return the value stored in this entry.
			return value;
		}
		
		@Override
		public String toString() 
		{
			// Return the key and value in a readable string format.
			return "[" + key + " , " + value + "]";
		}
		
	}

}