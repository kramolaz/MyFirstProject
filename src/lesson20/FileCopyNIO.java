package lesson20;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class FileCopyNIO implements FileCopyUtils {

    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException, IOException {


            Path pathSource = Paths.get(source);
            Path pathDestination = Paths.get(destination);
            Path fileCopy1 =  Files.copy(pathSource, pathDestination, StandardCopyOption.REPLACE_EXISTING);


    }
}
