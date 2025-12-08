class RandomizedSet {

    private HashSet<Integer> RandomizedSet;

    public RandomizedSet() {
        RandomizedSet = new HashSet<>();
    }

    public boolean insert(int val) {
        return RandomizedSet.add(val);
    }

    public boolean remove(int val) {
        return RandomizedSet.remove(val);

    }

    public int getRandom() {

        int index = new Random().nextInt(RandomizedSet.size());
        return (int) RandomizedSet.toArray()[index];

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */