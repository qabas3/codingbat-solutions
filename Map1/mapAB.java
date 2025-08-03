public Map<String, String> mapAB(Map<String, String> map) {

    if (map.containsKey("a") && map.containsKey("b")) {
        String combined = map.get("a") + map.get("b");
        map.put("ab", combined);
    }
    return map;
}
