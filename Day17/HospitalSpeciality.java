/*
 * Care hospital wants to know the medical speciality visited by 
the maximum number of patients. Assume that the patient id 
of the patient along with the medical speciality visited by
the patient is stored in a list. The details of the medical 
specialities are stored in a dictionary as follows:
{"P":"Pediatrics","O":"Orthopedics","E":"ENT
}
Write a function to find the medical speciality visited by
the maximum number of patients and return the name of the 
speciality.
Note:1.Assume that there is always only one medical speciality
which is visited by maximum number of patients.
2.Perform case sensitive string comparison wherever 
necessary.


Sample Input	                        Expected Output
[101,P,102,O,302,P,305,P]	          Pediatrics
[101,O,102,O,302,P,305,E,401,O,656,O]	     Orthopedics
[101,O,102,E,302,P,305,P,401,E,656,O,987,E]	ENT
 */

import java.util.*;

public class HospitalSpeciality {
    public static void main(String[] args) {
        List<String> patientDetails1 = Arrays.asList("101", "P", "102", "O", "302", "P", "305", "P");
        List<String> patientDetails2 = Arrays.asList("101", "O", "102", "O", "302", "P", "305", "E", "401", "O", "656", "O");
        List<String> patientDetails3 = Arrays.asList("101", "O", "102", "E", "302", "P", "305", "P", "401", "E", "656", "O", "987", "E");

        Map<String, String> specialities = getSpecialities();
        System.out.println("Most visited speciality: " + findMaxVisitedSpeciality(patientDetails1, specialities)); // Output: Pediatrics
        System.out.println("Most visited speciality: " + findMaxVisitedSpeciality(patientDetails2, specialities)); // Output: Orthopedics
        System.out.println("Most visited speciality: " + findMaxVisitedSpeciality(patientDetails3, specialities)); // Output: ENT
    }

    public static Map<String, String> getSpecialities() {
        // Create and return the dictionary of medical specialities
        Map<String, String> specialities = new HashMap<>();
        specialities.put("P", "Pediatrics");
        specialities.put("O", "Orthopedics");
        specialities.put("E", "ENT");
        return specialities;
    }

    public static String findMaxVisitedSpeciality(List<String> patientDetails, Map<String, String> specialities) {
        // Count the occurrences of each medical specialty using a HashMap
        Map<String, Integer> specialtyCount = new HashMap<>();
        for (int i = 1; i < patientDetails.size(); i += 2) {
            String specialtyCode = patientDetails.get(i);
            specialtyCount.put(specialtyCode, specialtyCount.getOrDefault(specialtyCode, 0) + 1);
        }

        // Find the medical specialty with the maximum patient count
        int maxCount = 0;
        String maxSpeciality = "";
        for (String specialtyCode : specialtyCount.keySet()) {
            int count = specialtyCount.get(specialtyCode);
            if (count > maxCount) {
                maxCount = count;
                maxSpeciality = specialities.get(specialtyCode);
            }
        }

        return maxSpeciality;
    }
}
