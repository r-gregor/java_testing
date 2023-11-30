import java.util.*;

class BaseMaterial {

    /**
     * retuturn Arrylist of consequtive intigers of size n
     * @param n
     * @return
     */
    public List<Integer> getIntArray(int n) {
        List<Integer> intArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            intArr.add(i + 1);
        }
        return intArr;
    }

    /**
     * Returns ArrayList of strings
     * @return
     */
    public List<String> getStrArray() {
        List<String> strArr = new ArrayList<>();
        strArr.add("Gregor");
        strArr.add("Redelonghi");
        strArr.add("Tadeja");
        strArr.add("Mali Redelonghi");
        strArr.add("Zelo dolg priimek ali ime");
        strArr.add("Mark");
        strArr.add("Zala");
        strArr.add("Špela");
        return strArr;
    }

    /**
     * Returns ANimals Map
     * @return
     */
    public Map<Integer, String> getAnimalsMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Jaguar");
        map.put(2, "Wolf");
        map.put(3, "Owl");
        map.put(4, "Horse");
        map.put(5, "Otter");
        map.put(6, "Shark");
        map.put(7, "King Cobra");
        map.put(8, "Whale");
        map.put(9, "Pangolin");
        map.put(10, "Bee");
        return map;
    }
}
