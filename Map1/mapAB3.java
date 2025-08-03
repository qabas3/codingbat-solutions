public Map<String, String> mapAB3(Map<String, String> map) {

    boolean hasA = map.containsKey("a") && map.get("a") != null;
    boolean hasB = map.containsKey("b") && map.get("b") != null;

    if (hasA && !hasB) {
        map.put("b", map.get("a"));
    } else if (!hasA && hasB) {
        map.put("a", map.get("b"));
    }

    return map;
}
