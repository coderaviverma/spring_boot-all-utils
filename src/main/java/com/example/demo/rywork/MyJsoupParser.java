package com.example.demo.rywork;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyJsoupParser {


    public static void main(String[] args) throws IOException {
//        Document doc = Jsoup.connect("https://www.iato.in/members/view/1925").get();
//        log(doc.title());

//        Elements tagtag = doc.getElementsByTag("#root");
//        Elements taghtml = doc.getElementsByTag("html");
//        Elements tagbody = doc.getElementsByTag("body");
//
//        Elements tagsection = doc.getElementsByTag("section");
//        Elements tagdiv1 = doc.getElementsByTag("div");
//        Elements tagdiv2 = doc.getElementsByTag("div").next();
//        Elements tagdiv3 = tagdiv2.tagName("div");
//        Elements tagdiv4 = doc.getElementsByTag("div").next().next();
//        Elements tagdiv5 = doc.getElementsByTag("div").next().next().next();
//        Elements tagdiv6 = doc.getElementsByTag("div").next().next().next().next();
//        Elements tagdiv8 = doc.getElementsByTag("div").next().next().next().next().next();
//        Elements tagdiv9 = doc.getElementsByTag("div").next().next().next().next().next().next();
//        Elements tagdiv10 = doc.getElementsByTag("div").next().next().next().next().next().next().next();
//        Elements tagdiv11 = doc.getElementsByTag("div").next().next().next().next().next().next().next();

//Element element=tagdiv9.select()


        ArrayList<String> linkList = new ArrayList();
        Map<String, Object[]> totalSheet = new TreeMap<>();
        totalSheet.put("1", new Object[]{"", "Name of the Company", "Contact Person", "Designation", "Street Address", "City", "State", "Pincode", "Email", "Phone", "Mobile", "Fax", "Website"});

//        linkList.add("https://www.iato.in/members/view/1925");
//        linkList.add("https://www.iato.in/members/view/1844");
        linkList.addAll(readLinksFromExcel());


        for (int i = 0; i < linkList.size(); i++) {

            Document doc = Jsoup.connect(linkList.get(i)).get();
            log(doc.title());

            Elements tagdiv9 = doc.getElementsByTag("div").next().next().next().next().next().next();

            for (Element link : tagdiv9) {
                String linkText = link.wholeText();

                if (linkText.contains("Contact Details")) {
                    System.out.println(linkText);

                    String linkText1 = linkText.replaceAll("\\t", "");
                    String[] dlinkText = linkText1.split("\\n");
                    System.out.println(dlinkText.length);
                    totalSheet.put((2 + i) + "", parseTheArray(dlinkText));

                }
            }
        }

        writeDataToExcel(totalSheet);

    }

    //    private static final String FILE_NAME = "/tmp/MyFirstExcel.xlsx";
    private static final String FILE_NAME = "IOTO_memberslist.xlsx";


    private static ArrayList readLinksFromExcel() {
        ArrayList<String> list = new ArrayList<>();

        try {

            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheetAt(0);
            Iterator<Row> iterator = datatypeSheet.iterator();

            while (iterator.hasNext()) {

                Row currentRow = iterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();

                while (cellIterator.hasNext()) {

                    Cell currentCell = cellIterator.next();
                    //getCellTypeEnum shown as deprecated for version 3.15
                    //getCellTypeEnum ill be renamed to getCellType starting from version 4.0
//                    if (currentCell.getCellTypeEnum() == CellType.STRING) {
//                        System.out.print(currentCell.getStringCellValue() + "--");
//                    } else if (currentCell.getCellTypeEnum() == CellType.NUMERIC) {
//                        System.out.print(currentCell.getNumericCellValue() + "--");
//                    }
                    Hyperlink h = currentCell.getHyperlink();

                    if (h == null) {
                        System.err.println("Cell didn't have a hyperlink!");
                    } else {
                        list.add(h.getAddress());
                        System.out.println("Link : " + h.getLabel() + " -> " + h.getAddress());
                    }

                }
                System.out.println();

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }


    private static Object[] parseTheArray(final String[] data) {

        List<String> ll = new ArrayList<>();
        for (String text : data) {
            Matcher m = Pattern.compile(":(.*)").matcher(text);
            if (m.find()) {
                System.out.println("--------------->>>>>>>>>>" + m.group(1).trim());

                if (text.contains("Fax")){

                }else {
                    ll.add(m.group(1).trim());
                }
            }
        }
//        writeDataToExcel(ll,rowCount);

        return ll.toArray();
    }

    // Blank workbook

    // Create a blank sheet

    private static void writeDataToExcel(Map<String, Object[]> data) {


        {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("student Details");


            // This data needs to be written (Object[])
//            Map<String, Object[]> data = new TreeMap<String, Object[]>();
//            data.put("1", new Object[]{"", "Name of the Company", "Contact Person", "Designation", "Street Address", "City", "State", "Pincode", "Email", "Phone", "Mobile", "Fax", "Website"});
//            data.put("" + (rowCount + 2), ll.toArray());

//            for (int i = 0; i < ll.size(); i++) {
//                data.put(""+(i+2), ll.toArray());
//            }


            // Iterate over data and write to sheet
            Set<String> keyset = data.keySet();
            int rownum = 0;
            for (String key : keyset) {
                // this creates a new row in the sheet
                Row row = sheet.createRow(rownum++);
                Object[] objArr = data.get(key);
                int cellnum = 0;
                for (Object obj : objArr) {
                    // this line creates a cell in the next column of that row
                    Cell cell = row.createCell(cellnum++);
                    if (obj instanceof String)
                        cell.setCellValue((String) obj);
                    else if (obj instanceof Integer)
                        cell.setCellValue((Integer) obj);
                }
            }
            try {
                // this Writes the workbook gfgcontribute
                FileOutputStream out = new FileOutputStream(new File("gfgcontribute.xlsx"));
                workbook.write(out);
                out.close();
                System.out.println("gfgcontribute.xlsx written successfully on disk.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void log(String msg, String... vals) {
        System.out.println(String.format(msg, vals));
    }
}
