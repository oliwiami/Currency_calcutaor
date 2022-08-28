import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    Parser parser = new Parser();

    @Test
    void test_CountryList_Size(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals(31,countryList.length);
    }
    @Test
    void test_RateList_Size(){
        parser.parse();
        String[] rateList = parser.getRateList();
        assertEquals(31,rateList.length);
    }
    @Test
    void test_CountryList_RateList_SameSize(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        String[] rateList = parser.getRateList();
        assertTrue(countryList.length==rateList.length);
    }

    @Test
    void test_Parser_CountryList_USD(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("USD",countryList[0]);
    }
    @Test
    void test_Parser_CountryList_JYP(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("JPY",countryList[1]);
    }
    @Test
    void test_Parser_CountryList_BGN(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("BGN",countryList[2]);
    }
    @Test
    void test_Parser_CountryList_CZK(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("CZK",countryList[3]);
    }
    @Test
    void test_Parser_CountryList_DKK(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("DKK",countryList[4]);
    }
    @Test
    void test_Parser_CountryList_GBP(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("GBP",countryList[5]);
    }
    @Test
    void test_Parser_CountryList_HUF(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("HUF",countryList[6]);
    }
    @Test
    void test_Parser_CountryList_PLN(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("PLN",countryList[7]);
    }
    @Test
    void test_Parser_CountryList_RON(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("RON",countryList[8]);
    }
    @Test
    void test_Parser_CountryList_SEK(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("SEK",countryList[9]);
    }
    @Test
    void test_Parser_CountryList_CHF(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("CHF",countryList[10]);
    }
    @Test
    void test_Parser_CountryList_ISK(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("ISK",countryList[11]);
    }
    @Test
    void test_Parser_CountryList_NOK(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("NOK",countryList[12]);
    }
    @Test
    void test_Parser_CountryList_HRK(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("HRK",countryList[13]);
    }
    @Test
    void test_Parser_CountryList_TRY(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("TRY",countryList[14]);
    }
    @Test
    void test_Parser_CountryList_AUD(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("AUD",countryList[15]);
    }
    @Test
    void test_Parser_CountryList_BRL(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("BRL",countryList[16]);
    }
    @Test
    void test_Parser_CountryList_CAD(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("CAD",countryList[17]);
    }
    @Test
    void test_Parser_CountryList_CNY(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("CNY",countryList[18]);
    }
    @Test
    void test_Parser_CountryList_HKD(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("HKD",countryList[19]);
    }
    @Test
    void test_Parser_CountryList_IDR(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("IDR",countryList[20]);
    }
    @Test
    void test_Parser_CountryList_ILS(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("ILS",countryList[21]);
    }
    @Test
    void test_Parser_CountryList_INR(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("INR",countryList[22]);
    }
    @Test
    void test_Parser_CountryList_KRW(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("KRW",countryList[23]);
    }
    @Test
    void test_Parser_CountryList_MXN(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("MXN",countryList[24]);
    }
    @Test
    void test_Parser_CountryList_MYR(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("MYR",countryList[25]);
    }
    @Test
    void test_Parser_CountryList_NZD(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("NZD",countryList[26]);
    }
    @Test
    void test_Parser_CountryList_PHP(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("PHP",countryList[27]);
    }
    @Test
    void test_Parser_CountryList_SGD(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("SGD",countryList[28]);
    }
    @Test
    void test_Parser_CountryList_THB(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("THB",countryList[29]);
    }
    @Test
    void test_Parser_CountryList_ZAR(){
        parser.parse();
        String[] countryList = parser.getCountryList();
        assertEquals("ZAR",countryList[30]);
    }
    @Test
    void test_Parser_RateList_first(){
        parser.parse();
        String[] rateList = parser.getRateList();
        assertEquals("1.0007",rateList[0]);
    }
    @Test
    void test_Parser_RateList_last(){
        parser.parse();
        String[] rateList = parser.getRateList();
        assertEquals("16.7995", rateList[rateList.length-1]);
    }
}