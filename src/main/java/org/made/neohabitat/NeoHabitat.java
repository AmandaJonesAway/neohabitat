
package org.made.neohabitat;

import java.util.Date;

/** This class overwritten by db/make version
*   it contains data that is (potentially) updated each build,
*   including the jMuddle output describing the client's resources by class.
*/

public class NeoHabitat {

    public static final String BUILD_NAME	   = "Public Release";

    public static final int    RESOURCE_IMAGE  = 0;
    public static final int    RESOURCE_ACTION = 1;
    public static final int    RESOURCE_SOUND  = 2;
    public static final int    RESOURCE_HEAD   = 3;

    public static final int[] InstanceSizes = {6,48,15,15,15,15,23,15,0,0,16,0,16,28,0,0,15,15,23,0,15,16,23,18,15,16,16,17,16,16,16,15,38,16,0,16,15,16,16,0,0,0,17,16,15,17,15,15,16,15,0,0,16,0,15,16,25,55,16,0,15,16,0,0,15,0,0,0,0,15,17,0,0,0,16,16,17,0,0,0,15,0,16,0,15,30,20,21,28,15,15,16,55,16,15,15,19,15,36,47,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,16,0,16,16,17,15,15,16,38,15,17,15,16,15,15,0,15,21,0,0,15,0,0,28,0,17,17,15,23,15,15,16,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,41};

    public static final int[] ClassSizes = {46,64,25,30,28,26,26,24,0,0,31,0,25,26,0,0,23,23,23,0,25,27,23,31,23,24,26,29,33,24,28,23,26,25,0,26,24,29,28,0,0,0,24,38,24,28,26,29,23,23,0,0,32,0,24,25,29,29,25,0,25,25,0,0,27,0,0,0,0,35,23,0,0,0,42,23,23,0,0,0,35,0,27,0,25,36,24,28,26,25,26,30,27,39,23,25,27,46,23,26,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,55,0,24,23,24,23,27,30,28,33,24,23,26,35,23,0,23,23,0,0,23,0,0,25,0,26,23,24,26,35,26,23,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,15};

    public static final int[][] ResourceSizes = {{70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,70,3442,287,336,1489,438,291,54,59,357,176,122,47,47,312,158,43,130,62,48,47,87,117,92,42,61,181,103,290,341,184,128,254,410,175,191,104,78,97,152,230,162,147,236,86,150,96,74,124,100,289,171,168,291,138,34,334,76,126,280,161,41,224,188,211,522,184,90,130,103,68,55,42,30,30,40,38,48,65,277,494,97,295,242,370,0,0,64,30,153,114,57,123,154,127,55,57,556,24,212,159,644,485,119,27,37,162,98,244,97,89,118,268,52,110,28,39,87,60,129,0,82,324,89,97,73,223,222,93,142,73,94,66,112,72,279,21,39,55,279,30,86,47,114,0,117,104,146,157,0,136,68,332,24,76,53,59,279,21,261,258,427,255,230,221,237,150,172,254,247,212,69,222,45,0,0,0,0,0,0,285,162,224,164,205,120,166,189,115,62,358,66,149,223,91,208,130,73,144,614,166,85,466,518,487,299,358,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},    // Images
                                                 {117,95,329,321,0,18,68,48,43,53,65,51,41,79,7,79,61,33,0,35,50,38,262,246,119,110,165,86,35,38,66,0,77,104,8,8,75,78,86,19,12,113,139,77,57,12,73,12,42,13,62,272,0,89,0,0,0,0,0,59,104,58,0,29,23,210,99,31,127,83,137,33,36,86,31,0,0,0,141,0,0,0,0,105,126,30,8,14,135,217,282,60,152,44,0,74,23,347,350,26,89,1,3,145,38,64,73,60,69,0,160,15,99,121,138,133,153,182,199,196,123,40,66,115,110,101,147,0,0,0,0,10,19,24,19,24,17,11,193,317,39,39,17,8,12,3,43,0,0,0,143,3,68,74,113,144,3,3,92,51,10,110,3,3,59,82,77,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},    // Actions
                                                 {93,34,9,22,9,14,14,24,9,14,14,14,21,14,28,28,18,12,38,12,28,12,18,12,28,54,0,25,28,38,14,34,24,24,21,34,36,9,0,24,9,0,0,0,14,11,0,18,12,18,12,24,9,0,0,0,0,0,0,0,21,0,0,31,17,38,0,18,14,22,9,14,34,9,0,64,9,29,29,0,0,0,58,27,0,71,9,14,0,0,0,0,0,0,0,0,21,9,32,16,25,35,0,0,54,9,44,9,24,9,14,38,0,31,0,21,0,18,19,31,9,31,9,31,9,22,9,14,9,24,17,31,37,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},	// Sounds
                                                 {70,162,167,180,169,138,283,160,165,157,119,267,270,267,231,206,272,279,191,247,296,222,254,164,178,206,252,221,247,171,232,208,164,193,317,212,253,192,222,256,206,183,196,175,233,212,221,225,205,256,205,184,238,227,230,258,179,303,261,177,175,280,290,228,196,259,240,238,179,245,234,204,265,247,188,215,237,260,319,300,275,296,280,257,281,198,255,202,244,206,211,191,290,212,223,203,215,209,210,247,239,263,247,252,255,209,256,192,258,236,152,367,308,280,178,261,246,280,183,199,235,272,257,246,303,259,271,153,302,280,177,188,300,330,194,292,209,211,258,279,194,315,403,270,271,193,160,277,333,225,260,214,231,269,256,228,289,209,212,205,326,266,208,243,321,240,297,223,251,310,354,362,235,224,233,262,340,394,313,247,426,214,272,205,275,233,251,255,295,297,243,237,258,300,267,256,250,276,251,224,254,315,217,236,245,211,240,274,242,223,251,197,252,250,218,230,284,262,257,266,244,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};   // Heads

    public static final int[][][] ClassResources = {{{},{162,162,151,101,162,162,100,162,152,155,167,166,166,166,156,153,166,157,154},{27,60,83,125,126,127,128,129,77,78,130,131,132}},{{32,33,34,35,36,37,230},{0,163,1,101,2,3,100,145,5,6,7,163,8,9,137,10,150,11,12,13,14,163,15,163,16,163,163,163,17,19,20},{1,2,3,4,111,113,101,101,100,101,15,14}},{{38},{105,107,111,101,116,163,100,145},{44,45}},{{102},{163,162,163,101,163,163,100,145,162,162,162,162,162,162,137},{}},{{41},{21,162,111,101,22,23,100,145},{47,48,49,50,0}},{{221},{164,126,111,101,165,163,100,145,131},{119,120}},{{42,43},{98,126,111,101,119,114,100,145},{6,5}},{{44,55},{102,126,111,101,116,163,100,145},{}},{{},{},{}},{{},{},{}},{{49,50,51,52,138,121,56,53,138},{24,126,111,101,116,163,100,145},{}},{{},{},{}},{{56},{102,26,111,101,116,163,100,145,140,141},{}},{{58,59},{98,126,111,101,119,114,100,145},{10,9}},{{},{},{}},{{},{},{}},{{73},{102,124,111,101,116,163,100,145},{}},{{75},{122,126,111,101,116,163,100,145},{}},{{78},{102,162,111,101,117,113,100,145},{}},{{},{},{}},{{79},{102,126,111,101,116,163,99,145},{22,23}},{{80,81},{30,126,111,101,116,163,100,145,131},{121,122}},{{82},{102,162,111,101,117,113,100,145},{}},{{83,84,223,224,233,234,235},{97,162,121,101,163,163,100,145},{25,24}},{{85},{102,162,111,101,163,163,100,145},{}},{{86},{32,126,111,101,116,163,100,145,142},{}},{{88},{36,126,111,101,116,163,100,145,143},{28,29}},{{89},{37,38,111,101,116,163,100,145,39,40},{33,32,39,40}},{{87},{102,162,111,101,163,163,33,145,162,34,35,100},{117,118,69,70,77,78}},{{91},{102,126,111,101,110,163,100,145,131},{}},{{92,93,120},{41,126,111,101,116,163,100,145,133,135},{68}},{{98},{102,126,111,101,116,163,100,145},{}},{{99,100},{44,162,111,101,117,113,100,145,45},{30}},{{101},{106,108,111,101,116,163,100,145},{119,120}},{{},{},{}},{{103},{46,126,111,101,116,163,100,145,47},{7,8}},{{104,105},{102,162,120,101,163,112,100,145},{}},{{106,107,108,109},{48,123,111,101,116,163,100,145},{33,32,34}},{{110,111},{102,163,163,163,163,163,100,145,49},{35,36,37}},{{},{},{}},{{},{},{}},{{},{},{}},{{118,119},{59,126,111,101,116,163,100,145},{}},{{120,121,122,123,124,125,181,149,39,182,186,136,145,57},{106,108,111,101,116,163,100,145},{121,122}},{{126,127},{102,124,111,101,116,163,100,145},{}},{{128},{60,126,111,101,116,163,61,145,64,63,100},{31,87}},{{129,228},{105,107,111,101,116,163,100,145},{123,124}},{{130,131,132,133,181},{105,107,111,101,116,163,100,145},{44,45}},{{134},{102,162,111,101,163,163,100,145},{}},{{135},{122,126,111,101,116,163,100,145},{}},{{},{},{}},{{},{},{}},{{137,227,123,124,125,98},{125,126,111,101,116,163,100,145,132,134},{68,68}},{{},{},{}},{{138},{65,126,111,101,116,163,100,145},{115}},{{216,212,222},{25,126,111,101,162,162,100,145},{}},{{159,160,161,162,163,164,165},{102,162,111,101,163,163,100,145},{}},{{159,160,161,162,163,164,165},{102,162,111,101,163,163,100,145},{}},{{140,141,142},{102,126,111,101,110,163,100,145},{}},{{},{},{}},{{144},{105,107,111,101,116,163,100,145},{119,120}},{{146,147,148},{102,126,111,101,110,163,100,145},{}},{{},{},{}},{{},{},{}},{{152},{66,126,111,101,116,163,100,145,67},{65,63,64}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{104,105,166,167,168,169,170,171,172,173,44,199,211},{102,162,72,101,163,163,100,145},{}},{{54},{88,89,111,101,116,163,100,145},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{183},{102,162,111,101,163,83,84,145,85,86,87,138,100},{16,17,18,19,20,21,96,97,117,118,69,70,77,78}},{{184},{122,126,111,101,116,163,100,145},{}},{{185},{88,89,111,101,116,163,100,145},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{104,105,166,167,168,169,170,171,172,173,44,199,211},{102,162,120,101,163,163,100,145},{}},{{},{},{}},{{217,218},{95,126,111,101,116,163,100,145,96},{75,76}},{{},{},{}},{{70},{102,27,111,101,116,163,100,145,28},{11}},{{201,203},{90,162,111,101,163,91,100,145,92,93,138},{16,17,18,19,20,21,71,72,73}},{{202,204},{162,162,162,162,162,162,162,145},{}},{{187,188},{102,162,160,101,163,161,100,145,72,120,120,163},{}},{{112},{53,162,111,101,118,114,100,145,98},{10,9}},{{154},{102,70,111,101,116,163,100,145,71},{82}},{{153},{68,162,144,101,163,163,100,145,69},{98,99}},{{108},{48,78,111,101,116,163,100,145},{33,32,106,107,108,109,110}},{{189},{102,162,160,101,163,161,100,145,72,120,120,163},{}},{{104,105,166,167,168,169,170,171,172,173,44,199,211},{102,162,160,101,163,161,100,145,72,120,120,163},{}},{{220},{146,146,146,101,146,146,100,145},{}},{{174},{73,163,111,101,116,163,100,145,74},{67}},{{139,236},{158,162,111,101,117,113,100,145,159},{51,52}},{{44,45,46,63,64,65,177,147,148,143,91,74,142,190,191,192,193,194,195,196,211},{103,162,111,101,163,163,100,145,104},{123,124}},{{47},{162,162,162,162,162,162,162,162},{}},{{232,237},{103,162,111,101,117,113,100,145},{123,124}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31},{50,126,111,101,51,163,100,145,112},{}},{{},{},{}},{{40},{102,126,111,101,116,163,100,145,131},{}},{{48},{102,162,139,101,117,113,100,145},{}},{{60,61},{102,162,120,101,163,163,100,145},{}},{{113},{102,162,72,101,163,163,100,145},{}},{{62,63,64,65,66},{102,162,111,101,163,163,100,145},{}},{{67,68,69,69,67,77,226,226},{102,162,139,101,117,113,100,145},{}},{{71,83,72,231},{98,162,111,101,118,114,100,145},{13,12}},{{74},{102,162,111,101,163,29,100,145,136,138},{16,17,18,19,20,21,104,105}},{{76,76},{102,162,139,101,117,113,100,145},{}},{{90},{102,162,111,101,163,163,100,145},{}},{{94},{42,162,111,101,163,163,100,145,133,135},{68}},{{95},{102,162,111,101,163,43,100,145,136,138},{16,17,18,19,20,21,85,86,51,52}},{{96},{102,162,111,101,115,163,99,145},{}},{{},{},{}},{{114},{102,162,111,101,163,163,100,145},{}},{{115},{102,162,120,101,115,163,100,145},{}},{{},{},{}},{{},{},{}},{{143},{102,162,111,101,115,163,100,145},{}},{{},{},{}},{{},{},{}},{{150},{98,162,111,101,118,114,100,145},{10,9}},{{},{},{}},{{155,156,157,158},{102,162,111,101,163,163,100,145},{}},{{176},{102,162,120,101,163,112,100,145},{}},{{177,178},{102,162,111,101,163,163,100,145},{}},{{179,78,82,225},{102,162,111,101,117,113,100,145},{}},{{190,191,192,193,194,195,196,197,198,199,200,66,229},{102,162,111,101,163,163,100,145},{}},{{212,213,214,215},{102,162,111,101,163,163,100,145},{}},{{97},{102,162,111,101,163,163,99,145},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{},{},{}},{{219},{},{}}};

    public static String GetBuildVersion() {
        return String.format(BUILD_NAME + ":%tc",  new Date(1521485918675l));
    }

}
