package com.example.demo.domain;

import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Andrew Han
 * @since 2019-10-03
 */
@Service
public class EmailExtractorService {

    public static final Pattern EMAIL_PATTERN = Pattern.compile("([\\w-_.]+@[\\w-_]+(?:[.][\\w-_]+)+)");

    public Set<String> extract(String value) {
        Set<String> set = new HashSet<>();
        String[] split = value.split("[\\s]+");
        for (String each : split) {
            Matcher matcher = EMAIL_PATTERN.matcher(each);
            if (matcher.find()) {
                String emailAddress = matcher.group(0);
                set.add(emailAddress);
            }

        }
        System.out.println(set);
        return set;
    }
}