import java.io.*;
import java.util.*;
import java.nio.file.FileAlreadyExistsException;
public class ReadAndWriteFile {
    public List<String> readFile(String filePath){
        List<String> countries = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            String[] split;
            while ((line = br.readLine()) != null) {
                countries.add(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return countries;
    }
}
