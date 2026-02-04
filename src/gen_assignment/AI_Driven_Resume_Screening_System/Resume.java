package gen_assignment.AI_Driven_Resume_Screening_System;

import java.util.*;

public class Resume<T extends JobRole> {

    public void process(T role) {
        System.out.println("Processing resume for: " + role.getRoleName());
    }

    public static void screenAll(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening: " + role.getRoleName());
        }
    }
}

