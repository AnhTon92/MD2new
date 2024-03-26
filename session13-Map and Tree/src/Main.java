import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
       Map<String, String> map = new HashMap<>();
       //thao tác thêm key - value
        map.put("SV001", "Nguyễn Văn A");
        map.put("SV002", "Nguyễn Văn B");
        map.put("SV003", "Nguyễn Văn C");
        System.out.println(map);

        //xóa theo key
        map.remove("SV001");
        System.out.println(map);

        //truy xuất giá trị theo key
        System.out.println(map.get("SV002"));

        //kiểm tra tồn tại theo key
        System.out.println(map.containsKey("SV002"));

        //key set
        Set<String> keySet = map.keySet();
        System.out.println(keySet);

        //entry key set
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String,String> entry: entries) {
            //làm việc với key- value
            System.out.printf("Key : %-10s | Value : %-20s\n", entry.getKey(), entry.getValue());
        }
    }
}