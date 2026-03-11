package practice;

import java.util.function.Predicate;
import model.Candidate;

public class CandidateValidator implements Predicate<Candidate> {

    @Override
    public boolean test(Candidate s) {
        return s.isAllowedToVote() && s.getAge() >= 35
                && s.getNationality().equals("Ukrainian")
                && (Integer.parseInt(s.getPeriodsInUkr().split("-")[1])
                - Integer.parseInt(s.getPeriodsInUkr().split("-")[0])) >= 10;
    }
}
