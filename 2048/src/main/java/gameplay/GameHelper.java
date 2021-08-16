package gameplay;

import java.util.*;
import java.util.stream.Collectors;

public class GameHelper {
    public List<Integer> moveAndMergeEquals(List<Integer> list) {
        if (!list.isEmpty() && list.stream().noneMatch(Objects::nonNull)) return list;
        List<Integer> filteredList = list.stream().filter(Objects::nonNull).collect(Collectors.toList());
        List<Integer> resultList = new ArrayList<>();
        int i = 0;
        while (i < filteredList.size()) {
            Integer currentItem = filteredList.get(i);
            // не последний элемент
            if (i < filteredList.size() - 1 && currentItem.equals(filteredList.get(i + 1))) {
                resultList.add(currentItem * 2);
                i = i + 2;
            } else {
                resultList.add(currentItem);
                i++;
            }
        }
        if (resultList.size() != list.size()) {
            int count = list.size() - resultList.size();
            for (int j = 0; j < count; j++) {
                resultList.add(null);
            }
        }
        return resultList;
    }
}
