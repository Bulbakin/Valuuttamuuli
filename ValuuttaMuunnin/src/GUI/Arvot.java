/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author s1601396
 */
public class Arvot {

    double AUD = 1.5008;
    double BGN = 1.9558;
    double BRL = 3.7568;
    double CAD = 1.4866;
    double CHF = 1.1389;
    double CNY = 7.8979;
    double CZK = 26.102;
    double DKK = 7.4393;
    double GBP = 0.9233;
    double HKD = 9.3292;
    double HRK = 7.4145;
    double HUF = 304.01;
    double IDR = 15903.18;
    double ILS = 4.2719;
    double INR = 76.2065;
    double JPY = 130.34;
    double KRW = 1335.56;
    double MXN = 21.0584;
    double MYR = 5.0889;
    double NOK = 9.262;
    double NZD = 1.6458;
    double PHP = 60.841;
    double PLN = 4.2581;
    double RON = 4.5977;
    double RUB = 69.659;
    double SEK = 9.5155;
    double SGD = 1.6156;
    double THB = 39.591;
    double TRY = 4.1063;
    double TWD = 35.8835;
    double USD = 1.1925;
    double ZAR = 15.5562;

    public double arvo(String valuutta) {
        if (valuutta.equals("AUD")) {
            return AUD;
        } else if (valuutta.equals("BGN")) {
            return BGN;
        } else if (valuutta.equals("BRL")) {
            return BRL;
        } else if (valuutta.equals("CAD")) {
            return CAD;
        } else if (valuutta.equals("CHF")) {
            return CHF;
        } else if (valuutta.equals("CNY")) {
            return CNY;
        } else if (valuutta.equals("CZK")) {
            return CZK;
        } else if (valuutta.equals("DKK")) {
            return DKK;
        } else if (valuutta.equals("GBP")) {
            return GBP;
        } else if (valuutta.equals("HKD")) {
            return HKD;
        } else if (valuutta.equals("HRK")) {
            return HRK;
        } else if (valuutta.equals("HUF")) {
            return HUF;
        } else if (valuutta.equals("IDR")) {
            return IDR;
        } else if (valuutta.equals("ILS")) {
            return ILS;
        } else if (valuutta.equals("INR")) {
            return INR;
        } else if (valuutta.equals("JPY")) {
            return JPY;
        } else if (valuutta.equals("KRW")) {
            return KRW;
        } else if (valuutta.equals("MXN")) {
            return MXN;
        } else if (valuutta.equals("MYR")) {
            return MYR;
        } else if (valuutta.equals("NOK")) {
            return NOK;
        } else if (valuutta.equals("NZD")) {
            return NZD;
        } else if (valuutta.equals("PHP")) {
            return PHP;
        } else if (valuutta.equals("PLN")) {
            return PLN;
        } else if (valuutta.equals("RON")) {
            return RON;
        } else if (valuutta.equals("RUB")) {
            return RUB;
        } else if (valuutta.equals("SEK")) {
            return SEK;
        } else if (valuutta.equals("SGD")) {
            return SGD;
        } else if (valuutta.equals("THB")) {
            return THB;
        } else if (valuutta.equals("TRY")) {
            return TRY;
        } else if (valuutta.equals("TWD")) {
            return TWD;
        } else if (valuutta.equals("USD")) {
            return USD;
        } else if (valuutta.equals("ZAR")) {
            return ZAR;
        }
        return 0;
    }

}
