package ferdinandNiyongiraAssignment3;

import java.util.LinkedList;

public class FerdinandNiyongiraHashMap<K, V> implements FerdinandNiyongiraMap<K, V>
{
	// Define the default hash table size. Must be a power of 2
	private final static int DEFAULT_INITIAL_CAPACITY = 4;
	
	// Define the maximum hash table size. 1 << 30 is same as 2^30
	private final static int MAXIMUM_CAPACITY = 1 << 30;
	
	// Current hash table capacity. Capacity is a power of 2
	private int capacity;
	
	// Define default load factor
	private final static float DEFAULT_MAX_LOAD_FACTOR = 0.75f;
	
	// Specify a load factor used in the hash table
	private float loadFactorThreshold;
	
	// The number of entries in the map
	private int size = 0;
	
	// Hash table is an array with each cell that is a linked list
	LinkedList<FerdinandNiyongiraMap.FerdinandNiyongiraEntry<K, V>>[] table;
	
	/** Construct a map with the default capacity and load factor */
	public FerdinandNiyongiraHashMap() 
	{
		// Call the constructor with the default capacity and load factor.
		this(DEFAULT_INITIAL_CAPACITY, DEFAULT_MAX_LOAD_FACTOR);
	}
	
	/** Construct a map with the specified initial capacity and 
	 * default load factor */
	public FerdinandNiyongiraHashMap(int initialCapacity) 
	{
		// Call the constructor using the specified capacity and default load factor.
		this(initialCapacity, DEFAULT_MAX_LOAD_FACTOR);
	}
	
	/** Construct a map with the specified initial capacity
	 * and load factor */
	public FerdinandNiyongiraHashMap(int initialCapacity, float loadFactorThreshold) 
	{
		// Limit the capacity to the maximum allowed capacity.
		if (initialCapacity > MAXIMUM_CAPACITY)
			this.capacity = MAXIMUM_CAPACITY;
		else
			// Adjust the capacity to the next power of 2.
			this.capacity = trimToPowerOf2(initialCapacity);
	
		// Store the load factor threshold used to determine when rehashing is needed.
	    this.loadFactorThreshold = loadFactorThreshold;
	
	    // Create the hash table using the calculated capacity.
	    table = new LinkedList[capacity];
	}
	
	@Override /** Remove all of the entries from this map */
	public void ferdinandNiyongiraClear() 
	{
		// Reset the number of entries to zero.
		size = 0;
	
		// Clear every bucket in the hash table.
	    removeEntries();
	}
	
	@Override /** Return true if the specified key is in the map */
	public boolean ferdinandNiyongiraContainsKey(K key) 
	{
		// If get() finds a value for the key, the key is considered to be present.
		if (ferdinandNiyongiraGet(key) != null)
	      return true;
	    else
	      return false;
	}
	
	@Override /** Return true if this map contains the value */
	public boolean ferdinandNiyongiraContainsValue(V value) 
	{
		// Examine every bucket in the hash table.
		for (int i = 0; i < capacity; i++) 
		{
			if (table[i] != null) 
			{
				// Get the linked list stored in the current bucket.
				LinkedList<FerdinandNiyongiraEntry<K, V>> bucket = table[i];
	
				// Check every entry in the current bucket.
				for (FerdinandNiyongiraEntry<K, V> entry : bucket)
					if (entry.getValue().equals(value))
						return true;
	        }
	     }
	
		// Return false if the value was not found in any bucket.
		return false;
	}
	
	@Override /** Return a set of entries in the map */
	public java.util.Set<FerdinandNiyongiraMap.FerdinandNiyongiraEntry<K, V>> ferdinandNiyongiraEntrySet() 
	{
		// Create a set to store all entries in the map.
		java.util.Set<FerdinandNiyongiraMap.FerdinandNiyongiraEntry<K, V>> set = new java.util.HashSet<>();
	
		// Examine every bucket in the hash table.
		for (int i = 0; i < capacity; i++) 
		{
			if (table[i] != null) 
			{
				// Get the linked list for the current bucket.
				LinkedList<FerdinandNiyongiraEntry<K, V>> bucket = table[i];
	
				// Add every entry from the bucket to the set.
				for (FerdinandNiyongiraEntry<K, V> entry : bucket)
					set.add(entry);
			}
		}
	
		// Return the set containing all map entries.
		return set;
	}
	
	@Override /** Return the value that matches the specified key */
	public V ferdinandNiyongiraGet(K key) 
	{
		// Calculate the bucket index where the key should be stored.
		int bucketIndex = hash(key.hashCode());
	
		// Check whether the calculated bucket contains any entries.
		if (table[bucketIndex] != null) 
		{
			// Get the linked list stored in the bucket.
			LinkedList<FerdinandNiyongiraEntry<K, V>> bucket = table[bucketIndex];
	
			// Search through the bucket for the specified key.
			for (FerdinandNiyongiraEntry<K, V> entry : bucket)
				if (entry.getKey().equals(key))
					return entry.getValue();
	    }
	
		// Return null when the key is not found.
		return null;
	  }
	
	@Override /** Return true if this map contains no entries */
	public boolean ferdinandNiyongiraIsEmpty() 
	{
		// The map is empty when its size is zero.
		return size == 0;
	}
	
	@Override /** Return a set consisting of the keys in this map */
	public java.util.Set<K> ferdinandNiyongiraKeySet() 
	{
		// Create a set to store all keys.
		java.util.Set<K> set = new java.util.HashSet<>();
	
		// Examine every bucket in the hash table.
		for (int i = 0; i < capacity; i++) 
		{
			if (table[i] != null) 
			{
				// Get the linked list stored in the current bucket.
				LinkedList<FerdinandNiyongiraEntry<K, V>> bucket = table[i];
	
				// Add each key from the bucket to the set.
				for (FerdinandNiyongiraEntry<K, V> entry : bucket)
					set.add(entry.getKey());
			}
		}
	
		// Return the set containing all keys.
		return set;
	}
	
	@Override /** Add an entry (key, value) into the map */
	public V ferdinandNiyongiraPut(K key, V value) 
	{
		// Check whether the key is already stored in the map.
		if (ferdinandNiyongiraGet(key) != null) 
		{ // The key is already in the map
	
			// Calculate the bucket containing the existing key.
			int bucketIndex = hash(key.hashCode());
	
			// Get the bucket containing the key.
			LinkedList<FerdinandNiyongiraEntry<K, V>> bucket = table[bucketIndex];
	
			// Search for the existing entry.
			for (FerdinandNiyongiraEntry<K, V> entry : bucket)
				if (entry.getKey().equals(key)) 
				{
					// Store the old value before replacing it.
					V oldValue = entry.getValue();
	
					// Replace old value with new value
					entry.value = value;
	
					// Return the old value for the key
					return oldValue;
					
				}
		}
	
		// Check load factor
		if (size >= capacity * loadFactorThreshold) 
		{
			// Do not allow the table to grow beyond the maximum capacity.
			if (capacity == MAXIMUM_CAPACITY)
				throw new RuntimeException("Exceeding maximum capacity");
	
			// Increase the table capacity and redistribute the entries.
			rehash();
			
		}
	
		// Calculate the bucket index for the new key.
	   int bucketIndex = hash(key.hashCode());
	
	   // Create a linked list for the bucket if it is not created
	   if (table[bucketIndex] == null) 
	   {
		   // Create a new linked list for this bucket.
		   table[bucketIndex] = new LinkedList<FerdinandNiyongiraEntry<K, V>>();
	   }
	
	   // Add a new entry (key, value) to hashTable[index]
	   table[bucketIndex].add(new FerdinandNiyongiraMap.FerdinandNiyongiraEntry<K, V>(key, value));
	
	   // Increase the number of entries in the map.
	   size++; // Increase size
	
	   // Return the value that was inserted.
	   return value;
	   
	}
	
	@Override /** Remove the entry for the specified key */
	public void ferdinandNiyongiraRemove(K key) 
	{
		// Calculate the bucket index for the specified key.
		int bucketIndex = hash(key.hashCode());
	
	    // Remove the entry that matches the key from a bucket
	    if (table[bucketIndex] != null) 
	    {
	    	// Get the bucket containing the possible matching key.
	    	LinkedList<FerdinandNiyongiraEntry<K, V>> bucket = table[bucketIndex];
	
	    	// Search through the bucket for the specified key.
	    	for (FerdinandNiyongiraEntry<K, V> entry : bucket)
	    		if (entry.getKey().equals(key)) 
	    		{
	    			// Remove the matching entry from the bucket.
	    			bucket.remove(entry);
	
	    			// Decrease the number of entries in the map.
	    			size--; // Decrease size
	
	    			break; // No need to continue in the loop	
	    		}
	    }
	}
	
	@Override /** Return the number of entries in this map */
	public int ferdinandNiyongiraSize() {
	  // Return the current number of entries stored in the map.
	  return size;
	}
	
	
	@Override /** Return a set consisting of the values in this map */
	public java.util.Set<V> ferdinandNiyongiraValues() 
	{
		// Create a set to store all values.
		java.util.Set<V> set = new java.util.HashSet<>();
	
		// Examine every bucket in the hash table.
		for (int i = 0; i < capacity; i++) 
		{
			if (table[i] != null) 
			{
				// Get the linked list stored in the current bucket.
				LinkedList<FerdinandNiyongiraEntry<K, V>> bucket = table[i];
	
				// Add each value from the bucket to the set.
				for (FerdinandNiyongiraEntry<K, V> entry : bucket)
					set.add(entry.getValue());
			}
		}
	
		// Return the set containing all values.
		return set;
	}
	
	/** Hash function */
	private int hash(int hashCode) 
	{
		// Mix the bits of the original hash code and limit the result to the table capacity.
		return supplementalHash(hashCode) & (capacity - 1);
	}
	
	/** Ensure the hashing is evenly distributed */
	private static int supplementalHash(int h) 
	{
		// Mix different portions of the hash code to improve distribution.
		h ^= (h >>> 20) ^ (h >>> 12);
	
		// Perform additional bit mixing before returning the hash code.
		return h ^ (h >>> 7) ^ (h >>> 4);
	}
	
	/** Return a power of 2 for initialCapacity */
	private int trimToPowerOf2(int initialCapacity) 
	{
		// Start with the smallest power of 2.
		int capacity = 1;
	
		// Continue doubling until the capacity is at least the requested size.
		while (capacity < initialCapacity) 
		{
			capacity <<= 1;
			
		}
	
		// Return the calculated power-of-two capacity.
		return capacity;
	}
	
	/** Remove all entries from each bucket */
	private void removeEntries() 
	{
		// Visit every bucket in the hash table.
		for (int i = 0; i < capacity; i++) 
		{
			if (table[i] != null) 
			{
				// Remove all entries from the current bucket.
				table[i].clear();
				
			}
	    }
	}
	
	/** Rehash the map */
	private void rehash() 
	{
		// Save all existing entries before replacing the table.
		java.util.Set<FerdinandNiyongiraEntry<K, V>> set = ferdinandNiyongiraEntrySet(); // Get entries
	
		// Double the capacity of the hash table.
		capacity <<= 1; // Double capacity
	
		// Create a new hash table using the larger capacity.
		table = new LinkedList[capacity]; // Create a new hash table
	
		// Reset size because the entries will be inserted again.
		size = 0; // Reset size to 0
	
		// Insert all saved entries into the new table.
		for (FerdinandNiyongiraEntry<K, V> entry : set) 
		{
			ferdinandNiyongiraPut(entry.getKey(), entry.getValue()); // Store to new table
	    }
	}
	
	@Override
	public String toString() 
	{
		// Create a StringBuilder to construct the map representation.
		StringBuilder builder = new StringBuilder("[");
	
		// Examine every bucket in the hash table.
		
		int count = 0;
		
		for (int i = 0; i < capacity; i++) 
		{
			if (table[i] != null && table[i].size() > 0)
	
				// Append every entry from the current bucket.
				for (FerdinandNiyongiraEntry<K, V> entry : table[i]) 
				{
					builder.append(entry);
					count ++;
					
					// Start a new line after every 15 entries.
					if (count % 7 == 0)
						builder.append("\n");
					else
						builder.append(", ");
				}
			
			
		}
	
		// Close the string representation.
		builder.append("]");
	
		// Return the completed string.
		return builder.toString();
	}
}