package FetchingDataFromExcel;

public class TestExcelUtils {

    public static void main(String[] args) {

        String excelPath = "src\\test\\java\\UserData.xlsx";
        String sheetName = "Sheet1";
        ExcelUtils excel = new ExcelUtils(excelPath, sheetName);

        excel.getRowCount();
        excel.getCellData(1, 0);
        excel.getCellData(1, 1);
        excel.getCellData(1, 2);
        excel.getCellData(2,0);
        excel.getCellData(2,1);
        excel.getCellData(2,2);
    }
}
