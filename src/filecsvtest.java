import java.util.List;

public class filecsvtest {
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> country = readAndWriteFile.readFile("C:\\Users\\admin\\OneDrive\\Máy tính\\Bảng tính chưa có tiêu đề - Trang tính1.csv");
        for (String line:country) {
            System.out.println(line);
        }
    }
}
