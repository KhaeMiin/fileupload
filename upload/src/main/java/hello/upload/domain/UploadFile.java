package hello.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    private String uploadFileName;
    private String storeFileName; //같은 파일로 저장하는 경우를 위해 서버에서 관리하는 파일명을 따로 만들어서 구분

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }
}
