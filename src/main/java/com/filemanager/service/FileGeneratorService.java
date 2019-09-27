package com.filemanager.service;

import org.springframework.stereotype.Service;

@Service
public class FileGeneratorService {

    public String generateFile() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(generateHeader());
        return stringBuilder.toString();
    }

    private String generateHeader() {
        return "**************************************************\n" +
                "*****                                        *****\n" +
                "**************************************************\n";
    }

}
