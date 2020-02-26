package com.example.smbupload.document.controller;

import com.example.smbupload.util.file.OkResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.example.smbupload.document.service.DocumentSvc;

import java.io.IOException;

@RestController
@RequestMapping("/v1/master/document")
public class DocumenController {

    @Autowired
    private DocumentSvc documentSvc;

    @RequestMapping(method = RequestMethod.POST)
    public OkResponse write(@RequestParam(value = "file") MultipartFile file) throws IOException {
        documentSvc.writeFile(file);

        return new OkResponse();
    }

}
