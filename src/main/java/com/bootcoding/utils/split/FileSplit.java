package com.bootcoding.utils.split;

import com.google.common.collect.Lists;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.List;

public class FileSplit {
    public static void main(String[] args) throws Exception {
        split("C:/Java Projects/archive (5)/bank_transactions.csv",50000,"C:/Java Projects/BankCSV");
    }
    public static void split(String inputpath, int datacount, String outputpath) throws  Exception{
       try{

           CSVReader csvReader= new CSVReader(new FileReader(inputpath));
           List<String[]> data= csvReader.readAll();

           List<List<String []>> partition = Lists.partition(data,datacount);

           for(List<String[]> list : partition){
               CSVWriter csvWriter = new CSVWriter(new FileWriter(outputpath + "/"+Instant.now().getNano()));
               csvWriter.writeAll(list);
           }

       }catch(Exception e){
           e.printStackTrace();

       }

        }

}
