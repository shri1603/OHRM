package com.openHRM.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.sql.Timestamp;

import org.apache.commons.validator.GenericValidator;

public class DateUtility
{

    public DateUtility()
    {
    }

    public static int getYear(String strDate)
    {
        return Integer.parseInt(strDate.substring(strDate.lastIndexOf("/") + 1, strDate.length()));
    }

    public static int getDay(String strDate)
    {
        return Integer.parseInt(strDate.substring(strDate.indexOf("/") + 1, strDate.lastIndexOf("/")));
    }

    public static int getMonth(String strDate)
    {
        return Integer.parseInt(strDate.substring(0, strDate.indexOf("/")));
    }

    public static Date getDateObjectWithSpecificTime(String strDate, int intHour, int intMinut, int intSecond)
    {
        Calendar cal = Calendar.getInstance(TimeZone.getDefault()
        								   ,Locale.UK);
        cal.set(getYear(strDate)
        	   ,getMonth(strDate) - 1
        	   ,getDay(strDate)
        	   ,intHour
        	   ,intMinut
        	   ,intSecond);
        cal.set(Calendar.MILLISECOND, 0);
        return new Date(cal.getTimeInMillis());
    }

    public static Date getDateObjectWithSpecificTime(Date dDate, int intHour, int intMinut, int intSecond)
    {
    	String szDate = getDateString(dDate, "MM/dd/yyyy") ;
        return getDateObjectWithSpecificTime(szDate, intHour, intMinut, intSecond) ;
    }

    public static int getYear1(String sDate)
    {
        if (sDate.length() == 12)
        {
            return Integer.parseInt(sDate.substring(8, 12));
        }
        else if (sDate.length() == 10)
        {
            //return Integer.parseInt(sDate.substring(0, 3));
        	return Integer.parseInt(sDate.substring(0, 4));
        }
        else
        {
            return Integer.parseInt(sDate.substring(7, 11));
        }
    }

    public static int getDay1(String sDate)
    {
        if (sDate.length() == 12)
        {
            return Integer.parseInt(sDate.substring(0, 2));
        }
        else if (sDate.length() == 10)
        {
            //return Integer.parseInt(sDate.substring(8, 9));
        	return Integer.parseInt(sDate.substring(8, 10));
        }
        else
        {
            return Integer.parseInt(sDate.substring(0, 1));
        }
    }

    public static int getMonth1(String sDate)
    {
        String sMon = null;
        if (sDate.length() == 12)
        {
            sMon = sDate.substring(3, 6);
        }
        else if (sDate.length() == 10)
        {
            //return Integer.parseInt(sDate.substring(5, 6));
        	return Integer.parseInt(sDate.substring(5, 7)) - 1 ;
        }
        else
        {
            sMon = sDate.substring(2, 5);
        }
        int mon = 0;
		String szMonths = new String("JanFebMarAprMayJunJulAugSepOctNovDec") ;
		mon = Math.round(szMonths.indexOf(sMon)/3) ;
        return mon;
    }

    public static Date getDateUpToEndOfDay(String szDate)
    {
    	Date dDate = getStringToDate(szDate) ;
    	return ( getDateUpToEndOfDay(dDate) ) ;
    }

    public static Date getDateUpToEndOfDay(Date dDate)
    {
    	GregorianCalendar fmtDate = new GregorianCalendar();
    	fmtDate.setTime(dDate);
    	fmtDate.set(Calendar.HOUR_OF_DAY, 23);
    	fmtDate.set(Calendar.MILLISECOND, 999);
    	fmtDate.set(Calendar.SECOND, 59);
    	fmtDate.set(Calendar.MINUTE, 59);
        return fmtDate.getTime();
    }

    public static Date getStringToDate(String sDate)
    {
    	GregorianCalendar fmtDate = new GregorianCalendar(TimeZone.getDefault()
														 ,Locale.UK);
        fmtDate.set(getYear1(sDate)
        		  , getMonth1(sDate)
        		  , getDay1(sDate), 0, 0, 0);
        fmtDate.set(Calendar.MILLISECOND, 0);
        return new Date(fmtDate.getTimeInMillis());
    }

    public static Date getFirstDateInMonth(String sDate)
    {
    	GregorianCalendar fmtDate = new GregorianCalendar(TimeZone.getDefault()
														 ,Locale.UK);
    	fmtDate.setTimeZone(TimeZone.getDefault()) ;
    	fmtDate.set(getYear1(sDate), getMonth1(sDate), 1, 0, 0, 0);
        return new Date(fmtDate.getTimeInMillis());
    }

    public static Date getFirstDateInMonth(Date dDate)
    {
    	return getFirstDateInMonth(DateUtility.getDateString(dDate, "dd MMM, yyyy")) ;
    }

    public static Date getLastDateInMonth(String sDate)
    {
    	GregorianCalendar fmtDate = new GregorianCalendar(TimeZone.getDefault()
														 ,Locale.UK);
    	fmtDate.setTimeZone(TimeZone.getDefault()) ;
    	fmtDate.set(getYear1(sDate), getMonth1(sDate), 1, 23, 59, 59);
    	fmtDate.set(Calendar.DAY_OF_MONTH
    			   ,fmtDate.getActualMaximum(Calendar.DAY_OF_MONTH));
        return new Date(fmtDate.getTimeInMillis());
    }

    public static Date getLastDateInMonth(Date dDate)
    {
    	return getLastDateInMonth(DateUtility.getDateString(dDate, "dd MMM, yyyy")) ;
    }

    public static String sayDayName(Date d)
    {
        DateFormat f = new SimpleDateFormat("EE", Locale.UK);
        return f.format(d);
    }

    public static int diffBetwDates(Date sDate, Date eDate)
    {
        long diff = (eDate.getTime()) - sDate.getTime();
        return (int)((diff / 0x5265c00L) + 1L);
    }

    public static String getDateString(Date dDate, String szDateFormate)
    {
        String szDate = "";
        String szDateFmt = szDateFormate;
        SimpleDateFormat fmt = new SimpleDateFormat(szDateFmt, Locale.UK);
        szDate = fmt.format(dDate);
        return szDate;
    }

    public static boolean checkDateValidity(String sDate)
    {
        boolean check = false;
        try
        {
            check = GenericValidator.isDate(sDate, "dd MMM, yyyy", true);
        }
        catch(Exception e)
        {
            check = false;
        }
        return check;
    }

    public static ArrayList getDatesBetween(Date fromDate, Date toDate)
    {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault()
        										,Locale.UK);
        ArrayList<Date> dateList = new ArrayList<Date>();
        if(fromDate.before(toDate))
        {
            Date dateCounter = fromDate;
            dateList.add(fromDate);
            for(; dateCounter.before(toDate); dateList.add(dateCounter))
            {
                calendar.setTime(dateCounter);
                int nextDate = calendar.get(Calendar.DAY_OF_MONTH) + 1;
                calendar.set(Calendar.DAY_OF_MONTH, nextDate);
                dateCounter = calendar.getTime();
            }

        }
        else if(!fromDate.before(toDate) && !fromDate.after(toDate))
        {
            dateList.add(fromDate);
        }
        return dateList;
    }

    public static ArrayList getWeekDays(int nworkingDay)
    {
        ArrayList<String> arrDays = new ArrayList<String>();
		String szDays[] = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" } ;
		String szTmp = String.valueOf( nworkingDay ) ;
		if (szTmp.length() != 7)
		{
			szTmp = "0" + szTmp ;
		}

		for (int nCntr = 0; nCntr < szTmp.length(); nCntr++)
		{
			if (szTmp.charAt(nCntr) == '1')
				arrDays.add(szDays[nCntr]) ;
		}
        return arrDays;
    }

    public static void setMonthYearArrays(ArrayList<String> arrszYear
    									 ,ArrayList<String> arrszMonths)
    {
		GregorianCalendar sdate = new GregorianCalendar(TimeZone.getDefault()
													   ,Locale.UK);
		String szMonths[] = { "January", "February", "March", "April", "May", "June",
		                      "July", "August", "September", "October", "November", "December" } ;

		int nYear = sdate.get( 1 ) ;
		for (int nCntr = -3; nCntr < 3 ; nCntr++)
		{
			arrszYear.add(String.valueOf(nYear + nCntr)) ;
		}
		for (int nCntr = 0; nCntr < szMonths.length ; nCntr++)
		{
			arrszMonths.add( szMonths[nCntr] ) ;
		}
    }

    public static String getShortMonthName(String strDate)
    {
    	// Value passed in should be Month number as a String
		GregorianCalendar sdate = new GregorianCalendar(TimeZone.getDefault()
													   ,Locale.UK);
		sdate.set(Calendar.MONTH, Integer.parseInt(strDate) - 1) ;
        return getDateString((Date)sdate.getTime(), "MMM");
    }

    public static int getDayOfMonth(Date date)
    {
		GregorianCalendar calendar = new GregorianCalendar(TimeZone.getDefault()
														  ,Locale.UK);
        calendar.setTime(date);
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

    public static int getWeekOfMonth(Date date)
    {
		GregorianCalendar calendar = new GregorianCalendar(TimeZone.getDefault()
														  ,Locale.UK);
        calendar.setTime(date);
        calendar.setFirstDayOfWeek(1);
        calendar.setMinimalDaysInFirstWeek(1);
        return calendar.get(Calendar.WEEK_OF_MONTH);
    }

	public static Timestamp getTimestamp(String szPattern, String szTimeStr)
				throws ParseException
	{
		// pattern is the format in which you're providing the time in tStr
		// hh:mm:si or hh:mm a etc ...
		//
		SimpleDateFormat sdf = null;
		sdf = new SimpleDateFormat(szPattern, Locale.UK);
		java.util.Date dt = sdf.parse(szTimeStr);
		return new Timestamp(dt.getTime());
	}

	public static String convertTimestampToString(String szPattern, Timestamp tsValue)
	{
		// pattern is the format in which you're providing the time in tStr
		// hh:mm:si or hh:mm a etc ...
		//
		GregorianCalendar sdate = new GregorianCalendar(TimeZone.getDefault()
													   ,Locale.UK);
		SimpleDateFormat sdf = null;
		sdf = new SimpleDateFormat(szPattern);
		sdate.setTime(tsValue) ;
		return sdf.format( sdate.getTime() ) ;
	}
	
	 public static String sayDayName1(Date d)
	    {
	        DateFormat f = new SimpleDateFormat("EEEE", Locale.UK);
	        return f.format(d);
	    }
}
