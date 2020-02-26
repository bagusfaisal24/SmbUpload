package com.example.smbupload.util.file;

import lombok.Data;

@Data
public class OkResponse {

    private String message;

    public OkResponse() {
        this.message = "ok";
    }

}
