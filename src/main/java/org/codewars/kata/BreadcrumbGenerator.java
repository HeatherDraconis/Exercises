package org.codewars.kata;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class BreadcrumbGenerator {
    public static String generate_bc(String url, String separator) {
        String[] urlArray = url.replaceFirst(".*://", "").split("/");
        int indexFinal = urlArray[urlArray.length - 1].matches("^index\\..*|^[.?#].*") ? urlArray.length - 2 : urlArray.length - 1;
        if (indexFinal == 0) return "<span class=\"active\">HOME</span>";
        StringJoiner stringJoiner1 = new StringJoiner(separator).add("<a href=\"/\">HOME</a>");
        StringJoiner stringJoiner2 = new StringJoiner("/");
        for (int i = 1; i < indexFinal; i++) {
            stringJoiner1.add("<a href=\"/" + stringJoiner2.add(urlArray[i]) + "/\">" + getAcronym(urlArray[i]) + "</a>");
        }
        return stringJoiner1.add("<span class=\"active\">" + getAcronym(urlArray[indexFinal]) + "</span>").toString();
    }

    private static String getAcronym(String urlElement) {
        urlElement =  urlElement.split("[.?#]")[0].toUpperCase().replace("-", " ");
        if(urlElement.length() > 30) {
            List<String> ignore = Arrays.asList("THE","OF","IN","FROM","BY","WITH","AND", "OR", "FOR", "TO", "AT", "A");
            return Arrays.stream(urlElement.split(" ")).filter(s -> !ignore.contains(s)).map(s -> s.substring(0, 1)).collect(Collectors.joining());
        }
        return urlElement;
    }
}