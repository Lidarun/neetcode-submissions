class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        char[] charArray;
        for (String s : strs) {
            charArray = s.toCharArray();
            Arrays.sort(charArray);
            String key = Arrays.toString(charArray);

            if (result.containsKey(key)) {
                List<String> strings = result.get(key);
                strings.add(s);
            } else {
                result.put(key, new ArrayList<>() {{
                    add(s);
                }});
            }
        }

        return result.values().stream()
                .toList();
    }
}
