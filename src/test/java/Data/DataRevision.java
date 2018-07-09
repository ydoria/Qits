package Data;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
//clase que me permite controlar los campos definidos en el archivo de excel, para posteriormente guardar los registros que son aprobados en las diferentes bandejas a ser evaluadas. 
public class DataRevision {
	public void Escribir(String deudor, String identificacion) throws Throwable{
		//Ruta donde se encuentra el data driven.
		String ruta="src/test/resources/datadriven/Data.xls";
		//Se le indica que solo debe guardar los expedientes aprobados
		String estado="Aprobado";
		java.util.Date fecha = new Date();
	
    	try {
    		FileInputStream fis = new FileInputStream(new File(ruta));
    		@SuppressWarnings("resource")
			HSSFWorkbook wb = new HSSFWorkbook(fis);
    		HSSFSheet sheet = wb.getSheetAt(0);
            Workbook aWorkBook = Workbook.getWorkbook(new File(ruta));
            WritableWorkbook aCopy = Workbook.createWorkbook(new File(ruta), aWorkBook);

            WritableSheet aCopySheet = aCopy.getSheet(0);
            //se especifican los campos según fila y columna 
            Label anotherWritableCell =  new Label(0,sheet.getLastRowNum()+1, deudor);
            Label anotherWritableCell1 =  new Label(1,sheet.getLastRowNum()+1, identificacion);
            Label anotherWritableCell3 =  new Label(2,sheet.getLastRowNum()+1, estado);
            Label anotherWritableCell2 =  new Label(3,sheet.getLastRowNum()+1, fecha.toString());
            aCopySheet.addCell(anotherWritableCell);
            aCopySheet.addCell(anotherWritableCell1);
            aCopySheet.addCell(anotherWritableCell2);
            aCopySheet.addCell(anotherWritableCell3);
            aCopy.write();
            aCopy.close(); 
    	}catch (Exception e) {
    		e.printStackTrace();
    	}		
	}
}
