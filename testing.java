//******************************************************************************
/// \copyright (c) 2017,2018 by Körber Pharma Inspection GmbH. All Rights Reserved
/// \test
/// All Rights Reserved
//******************************************************************************

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        String filename = "example.txt";
        String content = "Hello, this is the file content!";

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write
