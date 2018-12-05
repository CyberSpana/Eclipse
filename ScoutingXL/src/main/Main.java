package main;

import entities.*;
import dao.*;
import java.util.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.*;
import java.io.*;



public class Main {

	public static void main(String[] args) {
		
		try {		
			ProductModel pmodel = new ProductModel(); 
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("List Products");
			
			//Create Heading
			Row rowHeading = sheet.createRow(0);
			rowHeading.createCell(0).setCellValue("Scout Name");
			rowHeading.createCell(1).setCellValue("Alliance Color");
			rowHeading.createCell(2).setCellValue("Scouter ID");
			rowHeading.createCell(3).setCellValue("Team Number");
			rowHeading.createCell(4).setCellValue("Match Number");
			rowHeading.createCell(5).setCellValue("Auto Switch");
			rowHeading.createCell(6).setCellValue("Auto Scale");
			rowHeading.createCell(7).setCellValue("Cross Line");
			rowHeading.createCell(8).setCellValue("Tele Switch");
			rowHeading.createCell(9).setCellValue("Tele Scale");
			rowHeading.createCell(10).setCellValue("Park");
			rowHeading.createCell(11).setCellValue("Climb");
			rowHeading.createCell(12).setCellValue("Foul");
			rowHeading.createCell(13).setCellValue("Card");			
			for (int i = 0; i < 15; i++) {
				CellStyle stylerowHeading = workbook.createCellStyle();
				Font font = workbook.createFont();
				font.setBold(true);
				font.setFontName(HSSFFont.FONT_ARIAL);
				font.setFontHeightInPoints((short) 11);
				stylerowHeading.setFont(font);
				rowHeading.getCell(i).setCellStyle(stylerowHeading);
			}
			
			//Autofit
			for (int i = 0; i < 15; i++) {
				sheet.autoSizeColumn(i);
			}
			
			//Save To Excel File
			FileOutputStream out = new FileOutputStream(new File("ScoutingSheet.xls")); 
			workbook.write(out);
			out.close();
			workbook.close();
			System.out.println("Excel Successfully Written..");
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
