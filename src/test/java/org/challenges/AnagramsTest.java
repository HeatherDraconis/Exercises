package org.challenges;


import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AnagramsTest {

    @Test
    public void testStringToArray() {
        assertArrayEquals(new char[]{}, Anagrams.stringToArray(""));
        assertArrayEquals(new char[]{'a'}, Anagrams.stringToArray("a"));
        assertArrayEquals(new char[]{'f','r','e','d'}, Anagrams.stringToArray("fred"));
        assertArrayEquals(new char[]{'f','f','e','d'}, Anagrams.stringToArray("ffed"));
    }

    @Test
    public void testStringToSortedArray() {
        assertArrayEquals(new char[]{}, Anagrams.stringToSortedArray(""));
        assertArrayEquals(new char[]{'a'}, Anagrams.stringToSortedArray("a"));
        assertArrayEquals(new char[]{'d','e','f','r'}, Anagrams.stringToSortedArray("fred"));
        assertArrayEquals(new char[]{'d','e','f','f'}, Anagrams.stringToSortedArray("ffed"));
    }

    @Test
    public void testSortStringUsingArray() {
        assertEquals("", Anagrams.sortStringUsingArray(""));
        assertEquals("a", Anagrams.sortStringUsingArray("a"));
        assertEquals("defr", Anagrams.sortStringUsingArray("fred"));
        assertEquals("deff", Anagrams.sortStringUsingArray("ffed"));
    }

    @Test
    public void testStringToList() {
        assertEquals(List.of('a'), Anagrams.stringToList("a"));
        assertEquals(List.<Character>of(), Anagrams.stringToList(""));
        assertEquals(List.of('f','r','e','d'), Anagrams.stringToList("fred"));
        assertEquals(List.of('f','f','e','d'), Anagrams.stringToList("ffed"));
    }

    @Test
    public void testStringToSortedList() {
        assertEquals(List.<Character>of(), Anagrams.stringToSortedList(""));
        assertEquals(List.of('a'), Anagrams.stringToSortedList("a"));
        assertEquals(List.of('d','e','f','r'), Anagrams.stringToSortedList("fred"));
        assertEquals(List.of('d','e','f','f'), Anagrams.stringToSortedList("ffed"));
    }

    @Test
    public void testSortStringUsingList() {
        assertEquals("", Anagrams.sortStringUsingList(""));
        assertEquals("a", Anagrams.sortStringUsingList("a"));
        assertEquals("defr", Anagrams.sortStringUsingList("fred"));
        assertEquals("deff", Anagrams.sortStringUsingList("ffed"));
    }

    String JOHN = "THE FIRST GENERAL EPISTLE OF\n" +
            "JOHN\n" +
            "\n" +
            "\n" +
            "\fCHAPTER 1\n" +
            "1 That which was from the beginning, which we have heard, which we have seen with our eyes, which we have looked upon, and our hands have handled, of the Word of life;\n" +
            "2 (For the life was manifested, and we have seen it, and bear witness, and shew unto you that eternal life, which was with the Father, and was manifested unto us;)\n" +
            "3 That which we have seen and heard declare we unto you, that ye also may have fellowship with us: and truly our fellowship is with the Father, and with his Son Jesus Christ.\n" +
            "4 And these things write we unto you, that your joy may be full.\n" +
            "5 This then is the message which we have heard of him, and declare unto you, that God is light, and in him is no darkness at all.\n" +
            "6 If we say that we have fellowship with him, and walk in darkness, we lie, and do not the truth:\n" +
            "7 But if we walk in the light, as he is in the light, we have fellowship one with another, and the blood of Jesus Christ his Son cleanseth us from all sin.\n" +
            "8 If we say that we have no sin, we deceive ourselves, and the truth is not in us.\n" +
            "9 If we confess our sins, he is faithful and just to forgive us our sins, and to cleanse us from all unrighteousness.\n" +
            "10 If we say that we have not sinned, we make him a liar, and his word is not in us.\n" +
            "\n" +
            "CHAPTER 2\n" +
            "1 My little children, these things write I unto you, that ye sin not. And if any man sin, we have an advocate with the Father, Jesus Christ the righteous:\n" +
            "2 And he is the propitiation for our sins: and not for our's only, but also for the sins of the whole world.\n" +
            "3 And hereby we do know that we know him, if we keep his commandments.\n" +
            "4 He that saith, I know him, and keepeth not his commandments, is a liar, and the truth is not in him.\n" +
            "5 But whoso keepeth his word, in him verily is the love of God perfected: hereby know we that we are in him.\n" +
            "6 He that saith he abideth in him ought himself also so to walk, even as he walked.\n" +
            "7 Brethren, I write no new commandment unto you, but an old commandment which ye had from the beginning. The old commandment is the word which ye have heard from the beginning.\n" +
            "8 Again, a new commandment I write unto you, which thing is true in him and in you: because the darkness is past, and the true light now shineth.\n" +
            "9 He that saith he is in the light, and hateth his brother, is in darkness even until now.\n" +
            "10 He that loveth his brother abideth in the light, and there is none occasion of stumbling in him.\n" +
            "11 But he that hateth his brother is in darkness, and walketh in darkness, and knoweth not whither he goeth, because that darkness hath blinded his eyes.\n" +
            "12 I write unto you, little children, because your sins are forgiven you for his name's sake.\n" +
            "13 I write unto you, fathers, because ye have known him that is from the beginning. I write unto you, young men, because ye have overcome the wicked one. I write unto you, little children, because ye have known the Father.\n" +
            "14 I have written unto you, fathers, because ye have known him that is from the beginning. I have written unto you, young men, because ye are strong, and the word of God abideth in you, and ye have overcome the wicked one.\n" +
            "15 Love not the world, neither the things that are in the world. If any man love the world, the love of the Father is not in him.\n" +
            "16 For all that is in the world, the lust of the flesh, and the lust of the eyes, and the pride of life, is not of the Father, but is of the world.\n" +
            "17 And the world passeth away, and the lust thereof: but he that doeth the will of God abideth for ever.\n" +
            "18 Little children, it is the last time: and as ye have heard that antichrist shall come, even now are there many antichrists; whereby we know that it is the last time.\n" +
            "19 They went out from us, but they were not of us; for if they had been of us, they would no doubt have continued with us: but they went out, that they might be made manifest that they were not all of us.\n" +
            "20 But ye have an unction from the Holy One, and ye know all things.\n" +
            "21 I have not written unto you because ye know not the truth, but because ye know it, and that no lie is of the truth.\n" +
            "22 Who is a liar but he that denieth that Jesus is the Christ? He is antichrist, that denieth the Father and the Son.\n" +
            "23 Whosoever denieth the Son, the same hath not the Father: (but) he that acknowledgeth the Son hath the Father also.\n" +
            "24 Let that therefore abide in you, which ye have heard from the beginning. If that which ye have heard from the beginning shall remain in you, ye also shall continue in the Son, and in the Father.\n" +
            "25 And this is the promise that he hath promised us, even eternal life.\n" +
            "26 These things have I written unto you concerning them that seduce you.\n" +
            "27 But the anointing which ye have received of him abideth in you, and ye need not that any man teach you: but as the same anointing teacheth you of all things, and is truth, and is no lie, and even as it hath taught you, ye shall abide in him.\n" +
            "28 And now, little children, abide in him; that, when he shall appear, we may have confidence, and not be ashamed before him at his coming.\n" +
            "29 If ye know that he is righteous, ye know that every one that doeth righteousness is born of him.\n" +
            "\n" +
            "CHAPTER 3\n" +
            "1 Behold, what manner of love the Father hath bestowed upon us, that we should be called the sons of God: therefore the world knoweth us not, because it knew him not.\n" +
            "2 Beloved, now are we the sons of God, and it doth not yet appear what we shall be: but we know that, when he shall appear, we shall be like him; for we shall see him as he is.\n" +
            "3 And every man that hath this hope in him purifieth himself, even as he is pure.\n" +
            "4 Whosoever committeth sin transgresseth also the law: for sin is the transgression of the law.\n" +
            "5 And ye know that he was manifested to take away our sins; and in him is no sin.\n" +
            "6 Whosoever abideth in him sinneth not: whosoever sinneth hath not seen him, neither known him.\n" +
            "7 Little children, let no man deceive you: he that doeth righteousness is righteous, even as he is righteous.\n" +
            "8 He that committeth sin is of the devil; for the devil sinneth from the beginning. For this purpose the Son of God was manifested, that he might destroy the works of the devil.\n" +
            "9 Whosoever is born of God doth not commit sin; for his seed remaineth in him: and he cannot sin, because he is born of God.\n" +
            "10 In this the children of God are manifest, and the children of the devil: whosoever doeth not righteousness is not of God, neither he that loveth not his brother.\n" +
            "11 For this is the message that ye heard from the beginning, that we should love one another.\n" +
            "12 Not as Cain, who was of that wicked one, and slew his brother. And wherefore slew he him? Because his own works were evil, and his brother's righteous.\n" +
            "13 Marvel not, my brethren, if the world hate you.\n" +
            "14 We know that we have passed from death unto life, because we love the brethren. He that loveth not his brother abideth in death.\n" +
            "15 Whosoever hateth his brother is a murderer: and ye know that no murderer hath eternal life abiding in him.\n" +
            "16 Hereby perceive we the love of God, because he laid down his life for us: and we ought to lay down our lives for the brethren.\n" +
            "17 But whoso hath this world's good, and seeth his brother have need, and shutteth up his bowels of compassion from him, how dwelleth the love of God in him?\n" +
            "18 My little children, let us not love in word, neither in tongue; but in deed and in truth.\n" +
            "19 And hereby we know that we are of the truth, and shall assure our hearts before him.\n" +
            "20 For if our heart condemn us, God is greater than our heart, and knoweth all things.\n" +
            "21 Beloved, if our heart condemn us not, then have we confidence toward God.\n" +
            "22 And whatsoever we ask, we receive of him, because we keep his commandments, and do those things that are pleasing in his sight.\n" +
            "23 And this is his commandment, That we should believe on the name of his Son Jesus Christ, and love one another, as he gave us commandment.\n" +
            "24 And he that keepeth his commandments dwelleth in him, and he in him. And hereby we know that he abideth in us, by the Spirit which he hath given us.\n" +
            "\n" +
            "CHAPTER 4\n" +
            "1 Beloved, believe not every spirit, but try the spirits whether they are of God: because many false prophets are gone out into the world.\n" +
            "2 Hereby know ye the Spirit of God: Every spirit that confesseth that Jesus Christ is come in the flesh is of God:\n" +
            "3 And every spirit that confesseth not that Jesus Christ is come in the flesh is not of God: and this is that spirit of antichrist, whereof ye have heard that it should come; and even now already is it in the world.\n" +
            "4 Ye are of God, little children, and have overcome them: because greater is he that is in you, than he that is in the world.\n" +
            "5 They are of the world: therefore speak they of the world, and the world heareth them.\n" +
            "6 We are of God: he that knoweth God heareth us; he that is not of God heareth not us. Hereby know we the spirit of truth, and the spirit of error.\n" +
            "7 Beloved, let us love one another: for love is of God; and every one that loveth is born of God, and knoweth God.\n" +
            "8 He that loveth not knoweth not God; for God is love.\n" +
            "9 In this was manifested the love of God toward us, because that God sent his only begotten Son into the world, that we might live through him.\n" +
            "10 Herein is love, not that we loved God, but that he loved us, and sent his Son to be the propitiation for our sins.\n" +
            "11 Beloved, if God so loved us, we ought also to love one another.\n" +
            "12 No man hath seen God at any time. If we love one another, God dwelleth in us, and his love is perfected in us.\n" +
            "13 Hereby know we that we dwell in him, and he in us, because he hath given us of his Spirit.\n" +
            "14 And we have seen and do testify that the Father sent the Son to be the Saviour of the world.\n" +
            "15 Whosoever shall confess that Jesus is the Son of God, God dwelleth in him, and he in God.\n" +
            "16 And we have known and believed the love that God hath to us. God is love; and he that dwelleth in love dwelleth in God, and God in him.\n" +
            "17 Herein is our love made perfect, that we may have boldness in the day of judgment: because as he is, so are we in this world.\n" +
            "18 There is no fear in love; but perfect love casteth out fear: because fear hath torment. He that feareth is not made perfect in love.\n" +
            "19 We love him, because he first loved us.\n" +
            "20 If a man say, I love God, and hateth his brother, he is a liar: for he that loveth not his brother whom he hath seen, how can he love God whom he hath not seen?\n" +
            "21 And this commandment have we from him, That he who loveth God love his brother also.\n" +
            "\n" +
            "CHAPTER 5\n" +
            "1 Whosoever believeth that Jesus is the Christ is born of God: and every one that loveth him that begat loveth him also that is begotten of him.\n" +
            "2 By this we know that we love the children of God, when we love God, and keep his commandments.\n" +
            "3 For this is the love of God, that we keep his commandments: and his commandments are not grievous.\n" +
            "4 For whatsoever is born of God overcometh the world: and this is the victory that overcometh the world, even our faith.\n" +
            "5 Who is he that overcometh the world, but he that believeth that Jesus is the Son of God?\n" +
            "6 This is he that came by water and blood, even Jesus Christ; not by water only, but by water and blood. And it is the Spirit that beareth witness, because the Spirit is truth.\n" +
            "7 For there are three that bear record in heaven, the Father, the Word, and the Holy Ghost: and these three are one.\n" +
            "8 And there are three that bear witness in earth, the Spirit, and the water, and the blood: and these three agree in one.\n" +
            "9 If we receive the witness of men, the witness of God is greater: for this is the witness of God which he hath testified of his Son.\n" +
            "10 He that believeth on the Son of God hath the witness in himself: he that believeth not God hath made him a liar; because he believeth not the record that God gave of his Son.\n" +
            "11 And this is the record, that God hath given to us eternal life, and this life is in his Son.\n" +
            "12 He that hath the Son hath life; and he that hath not the Son of God hath not life.\n" +
            "13 These things have I written unto you that believe on the name of the Son of God; that ye may know that ye have eternal life, and that ye may believe on the name of the Son of God.\n" +
            "14 And this is the confidence that we have in him, that, if we ask any thing according to his will, he heareth us:\n" +
            "15 And if we know that he hear us, whatsoever we ask, we know that we have the petitions that we desired of him.\n" +
            "16 If any man see his brother sin a sin which is not unto death, he shall ask, and he shall give him life for them that sin not unto death. There is a sin unto death: I do not say that he shall pray for it.\n" +
            "17 All unrighteousness is sin: and there is a sin not unto death.\n" +
            "18 We know that whosoever is born of God sinneth not; but he that is begotten of God keepeth himself, and that wicked one toucheth him not.\n" +
            "19 And we know that we are of God, and the whole world lieth in wickedness.\n" +
            "20 And we know that the Son of God is come, and hath given us an understanding, that we may know him that is true, and we are in him that is true, even in his Son Jesus Christ. This is the true God, and eternal life.\n" +
            "21 Little children, keep yourselves from idols. Amen.\n" +
            "1 JOHN\n" +
            "\n" +
            " PAGE 4\n" +
            "\n" +
            " PAGE 1\n" +
            "\n" +
            "\n";
    @Test
    public void testIfAnagram() {
        assertFalse( Anagrams.ifAnagram("dog", "cat"));
        assertFalse( Anagrams.ifAnagram("dog", "dogs"));
        assertTrue( Anagrams.ifAnagram("dog", "dog"));
        assertTrue( Anagrams.ifAnagram("dog", "god"));
        assertTrue( Anagrams.ifAnagram("", ""));
        assertFalse( Anagrams.ifAnagram("", "not empty"));
        assertFalse( Anagrams.ifAnagram("not empty", ""));
        assertTrue( Anagrams.ifAnagram("Dog", "goD"));
        assertFalse( Anagrams.ifAnagram("dog", "goD"));
        assertTrue( Anagrams.ifAnagram("dogg", "ggod"));
        assertFalse( Anagrams.ifAnagram("dogg", "godd"));
        assertFalse( Anagrams.ifAnagram(JOHN, "dog"));
        assertTrue( Anagrams.ifAnagram(JOHN, JOHN));

        long start = new Date().getTime();
        for( int i=0;i<1000000;i++)
        {
            Anagrams.ifAnagram(JOHN, JOHN);
        }
        long end = new Date().getTime();
        System.out.println( end-start);
    }
}