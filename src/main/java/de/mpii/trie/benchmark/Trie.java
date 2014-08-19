package de.mpii.trie.benchmark;

/**
 * This interface describes a trie data structure. It maintains
 * an integer against a string key.
*/
public interface Trie {

    /**
     * This method returns the integer value associated with a key.
     * @param key, A string or the key
     * @return The integer mapped to the key. This is equal to -1
     * if the key does not exist
     */
    public int get(String key);
    
    /**
     * This method puts a (key, value) pair into the data structure. This
     * overwrites the previous value when the given key already exists
     * @param key, A string or the key
     * @param value, An integer or the value
     */
    public void put(String key, int value);
    
    
}
