package org.iesalixar.aleal.helper;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class Helper {
	
	private static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
		    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	/**
	 * Explanation:
	 *
	 *	^                 # start-of-string
	 *  (?=.*[0-9])       # a digit must occur at least once
	 *  (?=.*[a-z])       # a lower case letter must occur at least once
	 *	(?=.*[A-Z])       # an upper case letter must occur at least once
	 *	(?=.*[@#$%^&+=])  # a special character must occur at least once
	 *	(?=\S+$)          # no whitespace allowed in the entire string
	 *	.{8,}             # anything, at least eight places though
	 *	$                 # end-of-string
	 */
	private static final Pattern VALID_PASSWORD_REGEX = 
		    Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
	
	/**
	 * Explanation:
	 * 
	 * ^             	# Start of the line
     * [a-z0-9_-]	 	# Match characters and symbols in the list, a-z, 0-9, underscore, hyphen
     * {8,15}  		 	# Length at least 8 characters and maximum length of 15 
	 * $				# End of the line
	 */
	private static final Pattern VALID_USERNAME_REGEX = 
		    Pattern.compile("^[a-z0-9_-]{8,15}$");
	
	/**
	 * Explanation:
	 * 
	 * ^             	# Start of the line
     * [a-z0-9_ ]	 	# Match characters and symbols in the list, a-z, 0-9, underscore, space character
     * {10,50}  		 	# Length at least 10 characters and maximum length of 50 
	 * $				# End of the line
	 */
	private static final Pattern VALID_ADDRESS_REGEX = 
		    Pattern.compile("^[a-zA-ZáéíñóúüÁÉÍÑÓÚÜ0-9_ ]{10,50}$");
	
	public static boolean checkEmail(String email) {
		return (email!=null && VALID_EMAIL_ADDRESS_REGEX.matcher(email).find());		
	}
	
	public static boolean checkPassword(String password, String repeatPassword) {
		return (password !=null && repeatPassword !=null && password.equals(repeatPassword) && VALID_PASSWORD_REGEX.matcher(password).find());
	}
	
//	public static boolean checkUsername(String username) {
//		return (username !=null && VALID_USERNAME_REGEX.matcher(username).find() &&
//				UserDAO.availableUsername(username));
//	}
	
	public static boolean checkAddress(String address) {
		return (address!=null && VALID_ADDRESS_REGEX.matcher(address).find());		
	}
	
	/**
	 * check equal requirements for fullname as used for address
	 */
	public static boolean checkFullname(String fullname) {
		return (fullname!=null && VALID_ADDRESS_REGEX.matcher(fullname).find());		
	}
	
	public static boolean checkComment(String comment) {
		return (comment!=null && VALID_ADDRESS_REGEX.matcher(comment).find());		
	}

//	public static Classroom getClassroom(String classroomId) {
//		return ClassroomDAO.getClassroomById(Integer.valueOf(classroomId));
//	}
//
//	public static Timetable getTimetable(String timetableId) {
//		return TimetableDAO.getTimetableById(Integer.valueOf(timetableId));
//	}
	
	public static String changeDateFormat(java.sql.Date date) {
		Calendar cal = Calendar.getInstance();
        cal.setTime(date);
		return cal.get(Calendar.DATE) + "-" + (cal.get((Calendar.MONTH))+1) + "-" + cal.get(Calendar.YEAR);
	}
	
	public static Date fromStringToDate(String date) {
		Date result = new Date();
		DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			result = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	

}
