package com.epam.automation.api;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.*;

public class RestApiObject {

    private static final String fileNamePost = "post_response.txt";
    private static final String fileNameGet = "get_response.pdf";


    public String post(String url) {
        try {
            return "POST: " + url + "/" + printResponse(fileNamePost);
        } catch (IOException e) {
            e.printStackTrace();
            return "Sorry, IOException";
        }
    }

    public String get(String url) {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileNameGet);
        return "GET: " + url + "/" + convertToStringFromPdf(inputStream);
    }

    public int delete() {
        return 5;
    }


    public String printResponse(String file) throws IOException {
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line = reader.readLine();
        return line;
    }

    public String convertToStringFromPdf(InputStream pdf) {
        PDDocument document = null;
        try {
            document = PDDocument.load(pdf);
            PDFTextStripper stripper = new PDFTextStripper();
            String result = stripper.getText(document).trim();
            return result;
        } catch (IOException e) {
            return "Problem with converting file";
        } finally {
            if (document != null) {
                try {
                    document.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}


