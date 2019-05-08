package com.epam.automation.api;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.*;

public class RestApiObject {

    private static final String fileNamePost = "post_response.txt";
    private static final String fileNameGet = "get_response.pdf";


    public String post(String url) {

        try {String response = printResponse(fileNamePost);

            return "POST: " + url + "/" + response;
        } catch (IOException e) {
            e.printStackTrace();
            return "Sorry, IOException";
        }
    }

    public String get(String url) {
        return "GET: " + url + "/response from method get";
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

    public String convertToStringFromPdf(InputStream pdf) throws IOException {
        PDDocument document = null;
        try {
            String separator = " ";
            document = PDDocument.load(pdf);
            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setWordSeparator(separator);
            stripper.setSortByPosition(true);
            stripper.setShouldSeparateByBeads(true);
            String result = stripper.getText(document).trim();
            return result;
        } finally {
            if (document != null) {
                document.close();
            }
        }
    }

}


