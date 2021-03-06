package org.apache.lucene.analysis.ko;

import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.util.TokenFilterFactory;

import java.util.Map;

/**
 * Created by SooMyung(soomyung.lee@gmail.com) on 2014. 7. 30.
 */

public class PunctuationDelimitFilterFactory extends TokenFilterFactory {
    /**
     * Initialize this factory via a set of key-value pairs.
     *
     * @param args
     */
    public PunctuationDelimitFilterFactory(Map<String, String> args) {
        super(args);
    }

    @Override
    public TokenStream create(TokenStream input) {
        return new PunctuationDelimitFilter(input);
    }
}
