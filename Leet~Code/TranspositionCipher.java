import java.util.*;

class TranspositionCipher{

  List<List> cipherText(String s, String key) {
    if (s == null || s.length()==0) {
      return null;
    }

    StringBuilder sb = new StringBuilder();

    List<List> l = new ArrayList<>();
    for (int j = 0; j < key.length() ; j ++) {
        List<Character> tmp = new ArrayList<>();
        l.add(tmp);
    }



    // if (k>0) {
      for (int i = 0; i < s.length() ; i++) {
          //while (m < k.length()) {

          List<Character> temp = l.get(Character.getNumericValue(key.charAt(i%(key.length()))));
            temp.add(s.charAt(i));

            // if (m == k.length()) {
            //   m = 0
            //   break;
            // }
          //}

      }
    // }
    return l;
  }

  void print(List<List> res) {
    StringBuilder sb = new StringBuilder();
    for (List<Character> l : res) {
      for (Character s : l) {
          sb.append(s);
      }
    }
    System.out.print(sb.toString());
  }

    // 1 0 2 4 3
   // t h e s h
  // a d o w o

  public static void main(String[] args) {
    TranspositionCipher t = new TranspositionCipher();
    List<List> result = t.cipherText("theshadowofthemoonsweptacrosstheglobefromhongkongtothetexaspanhandleasarareannularsolareclipsebeganmondaymorninginasiaandtraversedthepacificthesunappearedasathinringbehindthemoontopeopleinanarrowpathalongthecenterofthetrackwhichbeganinsouthernchinaheavycloudsobscuredtheviewinhongkongbutresidentsoftokyoandothercitieswereabletogetaspectacularviewforaboutfourminutesaroundseventhirtytwoammondaysixthirtytwopmetsundayeventswereheldatschoolsandmuseumsinjapanwhilemanymorepeopletookintheunusualastronomicaleventathomeoronstreetcornersafterwhizzingacrossthepacifictheshadowemergedovernortherncaliforniaandsouthernoregonwherethousandsofpeopleattendedpartiestowatchtheeventthefirsttoappearintheunitedstatessincenineteenninetyfourexpertswarnedthathopefulviewersshouldnotpeerupattheskywithoutspecialviewingequipmentsincelookingatthesunwiththenakedeyecancauseblindnessderekralstonaprofessionalphotographersaidheusedaweldingfiltertocaptureadirectviewofeclipseinthefoothillsaboveorovillecaliforniahesharedthephotooncnnireportnotingtheratherslimswathoftheglobewhocouldseetheimpactoftheeclipseralstonsaidhewantedtoenabletherestoftheworldtoseehowclearitlookedtothoseofuswhowerefortunateenoughtoseeitthesliverofsunshinethentraveledsoutheastacrosscentralnevadasouthernutahandnorthernarizonaandthennewmexicoitpassedoveralbuquerquenewmexicoaboutseventhirtyfourpmninethirtyfourpmetbeforepeteringouteastoflubbocktexasaccordingtonasa", "10243");
    t.print(result);
  }
}
