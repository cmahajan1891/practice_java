import java.util.*;

class DecryptMessage{

	void decrypt(String s) {
		char[] ch = s.toCharArray();

		List<String> list = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			StringBuilder sb = new StringBuilder();
			int c = i;
			while (c <= ch.length-1) {
				sb.append(ch[c]);
					c = c + 3;
			}
			list.add(sb.toString());
		}
		for (String st : list) {
			System.out.println(st);
		}
	}

	public static void main(String[] args) {
		DecryptMessage d = new DecryptMessage();
    d.decrypt("wyctlgjlfkieybrsyjdiepnvryfyczjuaiigmyeuooqcpfnvthfwyszmryiqnmpzmffqnaybkmgtlvjmqjhvllnycalgbycbsjvhnhwyfyuexuaijetxhhyexuyqisybrrvnxyqthvqfrluyqsbgnnnhrijetjrwnltzfthlybnyqnxbnheriuaizrswrivlhlvrcaffffjcflrsnydqbwevsastlatlgmebwynxghwxrwihxxvhnnyiexbvumbsscnwgzlrxyayyeyuvsgrsnjfminwgngveyqwypjhgqsvsuzfdbwwbwjbwugjmrhoennlglrfwufjcflrsnydcawygffvfnvthstlgmyhuwbrcalwbryqdnujcayyeacrbxvlcgffptjvjmbkoawyyjufjxsnfzxjrwmbsuykcafhpnuyiugfiajhgjlgfcaryaycaiofyllsigfvyjmrruvqmcfmfbieimnsxbybrwcakierugniaflruieyyqthrmoailrinrwuodnrxisiugfcaffymuijvrjhfyiyjhngihyzbzlgdavluodnrxbnayojyaruqjjhgfvhmbkueruvsmgwynrjhgfvhugniaxqunwuflrsyijlejnvhyayuotogxwbqxvsayjmfjmgfvynmujxzjxvfiijlnwwnsywtoesuynmgnwfhlhufrxuejjhgfvxbvsaqfgnlcalxnyuswizybvxnetprfmajqfuucjlffhqsyjxwufhajffhuyqnujmgtfrsmbssqfnnbcgmaejugwyynmufhqguejflhiahynqyqhiayyzunstlutfydqbtxgmyajqltlxyczjmvxmuflvsahswuflvyuoqyptgzjhgxgniyvsyzfcyxvryqrjhgmyrcnefieicaflvqsfzwpjmfkoyulbiopjlfhigylhicafhqxiadmgzxvtwbhbnnljtgnsuzdjnxwnqnujqnxbvsagthctmgjgcmufntrxnufnezxvsbnioapcaiqbwxfkieulbrcajhgfwgwyfxxvwypyiefhqulbiopjlnsarqcafdbqcrfmjjfyfmstlnscyqwbswrnprijyfhgtvhnfqfwyjicfnefgbacrflbzhqoiynygngrrutftvsyfxuzklveyyqnrfmrxnujmrayarifyihylnlybzmgmcalmjjfrflajxswizybrxiadbnheswcmjfyiypqcajxgtlrxjbsxgtkhjmgniaxzetgafnvthnqlracrbiaqcajuotogybrulbulvjnltzgwuskcppcalcaxnbqyalibimstlgmyczlctmrtzjwcgnhtglrfnuqyfxueycpqyffvbznfhogyfrgogynufnvkcgnhitfijxnssbybrwcaiofyllbihqxojwbsmviyejxjjfybcgmcaybrgihsxnwcrxissieruybiepjyfwrxhvucaluyxiqjwynhvsagtwbrgrsnznwufyyhcruflfhqglbtefguesyftzgmygngrxuaipnwcrysfffrcmgjxzfhnbufmcalnbsjbxnricgtlejmcthqxnufngmycfjrwxbjmatncjlznnejjbwnrwmgtvejuxybrqujnhczlfzcgtzfyienyfbyajprwyahihwutjuadiajnbxnrffqtwhryaymafnvthnqypthbrsnsxozmvsyfxyqnnbwaejafhbajcqjljwcgjmvsuajgnnfgthnycbsuywyinyjthynhrmijjprwqujhqtwhryaymzferybrnljfsvsnbybruooqcpiizfcatlnwyfjhgyihxqrflrbcgmcatoewctmnfyiejjbwnbsnujgyjuxxzetgptgcfhvjmnsxttprwhzjhgfarswvjmnwyatnhswbrgbsiijlzfhliypfxrxmhhbyjuxxbnaycwyfjhgjxajqftltfhveugniaxqvybnbcqjlnsartzpnlpzgfyuahyfybnywnqfstlgmyzyircyehcfjdhiazjhgbynxmrxmrfwuxygtzsfwgxcaicinxhffydcaybvxcaxnnswrybrwyyjufjisiipzgrsnfbuffhrayaynufnqjgnsxriwbayefarfhqybrnhstlzfnvthowihlbgyiynauybnxmgnlejxqnmpzmfniafvbznnmifyisqytnnvrugjcfxorxnufnnqmbbuewuayyqhiijlnly"
		);
  }
	}
