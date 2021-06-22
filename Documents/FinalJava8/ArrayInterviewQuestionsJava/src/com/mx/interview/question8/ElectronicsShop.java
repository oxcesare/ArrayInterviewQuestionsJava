package com.mx.interview.question8;

public class ElectronicsShop {

	public static void main(String[] args) {

		int b = 839979;

		/*
		 * 
		 * int [] keyboards = {4}; int [] drives = {5};
		 */

		int[] keyboards = { 659073, 674456, 878173, 532602, 868253, 721585, 806107, 141310, 790209, 212031, 304748,
				818920, 80938, 322601, 403071, 22899, 173564, 153826, 695108, 223665, 346178, 957539, 975830, 573171,
				641117, 932941, 822666, 575293, 132555, 479463, 862209, 313799, 922966, 606508, 487172, 139230, 606390,
				898464, 764983, 829520, 174879, 317603, 502680, 953013, 398753, 825387, 146407, 666457, 367618, 121790,
				68188, 478342, 25818, 506222, 135197, 232604, 963333, 79984, 549654, 776899, 966040, 122063, 432596,
				594425, 311887, 936661, 506256, 876303, 439611, 277816, 105689, 851641, 640971, 333, 216087, 17692,
				619728, 602689, 650348, 364881, 152060, 386548, 61364, 564569, 780938, 191826, 459905, 211804, 58177,
				484711, 995091, 754424, 57794, 619638, 695192, 297423, 983901, 430435, 239234, 170704, 142282, 74647,
				121413, 782873, 303344, 265448, 101069, 177807, 692318, 691774, 62306, 618191, 509537, 633333, 996922,
				228947, 814154, 232698, 615359, 220853, 306323, 173792, 624037, 655872, 527161, 848207, 426180, 724481,
				130740, 792273, 886804, 404890, 449886, 654224, 194667, 354317, 367843, 525624, 414224, 481744, 827725,
				176927, 733780, 387166, 769479, 964040, 11034, 248637, 416248, 133834, 481453, 418675, 19197, 790516,
				259872, 582280, 760462, 681129, 137141, 189738, 535431, 619088, 215251, 323574, 12124, 834492, 241256,
				629441, 976094, 198902, 801718, 64632, 959793, 42643, 487964, 371493, 109761, 265912, 548083, 646236,
				454480, 499447, 844548, 266080, 98105, 149272, 488352, 127229, 150083, 864856, 324750, 243533, 737524,
				651858, 476126, 810869, 375973, 614220, 394566, 859759, 459551, 392483, 785194, 956438, 892286, 133175,
				955550, 102173, 787081, 658841, 315478, 943044, 688290, 809066, 437702, 76435, 254728, 279431, 841061,
				930529, 38436, 253116, 901966, 781347, 461582, 825319, 637346, 495564, 659503, 386436, 895320, 450226,
				636814, 227016, 614072, 889592, 66668, 450722, 518525, 882659, 150203, 105718, 737600, 988498, 512338,
				443373, 680382, 47842, 41683, 38031, 84812, 746376, 716485, 659184, 72101, 802312, 71273, 105392, 12112,
				35579, 956717, 508694, 737675, 387683, 353331, 462052, 296603, 991812, 349783, 970969, 774829, 942528,
				661520, 784020, 185238, 354922, 174149, 412224, 98418, 549740, 660452, 830722, 764545, 68729, 265107,
				424393, 20950, 82637, 82191, 514774, 968079, 899104, 295512, 782662, 769397, 227894, 624805, 976211,
				382026, 667501, 205734, 10431, 121414, 255472, 615152, 260773, 774809, 69270, 644050, 960043, 530422,
				478364, 41961, 896017, 968707, 322289, 798895, 125262, 292888, 474443, 980192, 113983, 602018, 486125,
				582554, 920505, 748242, 520886, 811953, 616639, 656627, 156674, 128125, 43746, 338344, 110833, 928293,
				598667, 224667, 95034, 372251, 376078, 432175, 550216, 439504, 388741, 613078, 163721, 943289, 273853,
				240747, 928527, 121529, 676135, 197515, 496160, 887125, 12718, 645957, 992639, 285972, 671607, 816131,
				316994, 861565, 879467, 846706, 258490, 919134, 544140, 252298, 636215, 755213, 221114, 460644, 978618,
				842189, 748361, 728655, 557939, 776623, 180636, 656310, 53871, 177469, 320132, 545150, 753358, 984892,
				269392, 937600, 539678, 43184, 728112, 164852, 107969, 131759, 685453, 726144, 91892, 817970, 965348,
				213560, 488505, 505967, 150711, 840893, 342461, 732967, 413510, 542360, 758356, 590481, 743592, 508476,
				612079, 297616, 105955, 565150, 151604, 689041, 93779, 873520, 577303, 636435, 877337, 761293, 433899,
				160108, 160885, 461662, 558169, 9334, 811936, 246735, 741880, 726626, 881650, 992034, 277965, 99201,
				193998, 401585, 880015, 800252, 657709, 204082, 310999, 555210, 742516, 733237, 815303, 616125, 615117,
				188068, 688040, 355465, 375345, 783969, 538818, 554352, 524278, 5231, 848239, 761163, 840154, 35320,
				832869, 745902, 11035, 202527, 749715, 958290, 758848, 368024, 678532, 327006, 756436, 148922, 842161,
				305674, 470425, 876849, 502164, 996559, 124743, 368393, 385463, 448712, 643511, 722234, 780576, 886396,
				217259, 593178, 137854, 391614, 663192, 412715, 1881, 695775, 178413, 3219, 29078, 619729, 166923,
				355574, 181361, 794377, 387761, 93012, 402418, 588335, 874460, 481082, 510225, 642471, 723568, 64869,
				104161, 580115, 225490, 561612, 703102, 560787, 52816, 603624, 486708, 676621, 599504, 805171, 602282,
				269882, 22938, 825236, 322181, 498368, 636635, 77076, 149034, 58565, 695573, 334314, 746094, 785074,
				982191, 707841, 209890, 788793, 825317, 517386, 520414, 440299, 373547, 147486, 122405, 328267, 735672,
				434118, 235911, 88621, 371506, 220662, 62557, 598361, 801548, 735829, 766762, 998573, 733782, 933324,
				299511, 642710, 173520, 421343, 637697, 636321, 496279, 785829, 178293, 118363, 686066, 409998, 991350,
				839992, 747388, 383920, 740154, 572002, 950527, 587902, 202983, 184518, 565678, 362318, 979868, 334587,
				165332, 26203, 700410, 24198, 585943, 831885, 586612, 273133, 697828, 518196, 929827, 298793, 782759,
				940892, 56149, 259356, 852921, 429754, 225593, 872927, 377000, 842124, 461837, 186144, 481015, 802825,
				435279, 458291, 937565, 483078, 706179, 133511, 631313, 80620, 49854, 728104, 904117, 496573, 909596,
				436950, 780389, 729673, 7031, 765686, 57294, 158944, 225275, 610363, 131379, 135385, 398926, 751545,
				922831, 657104, 472167, 956831, 13406, 68974, 282810, 57068, 44605, 282251, 36296, 261765, 275782,
				247035, 275675, 906459, 787304, 249603, 975055, 272011, 371291, 759570, 428984, 449842, 844980, 776886,
				268200, 65381, 156418, 487682, 853282, 33622, 46512, 62668, 619840, 906642, 562120, 139277, 345999,
				532541, 315261, 411189, 772032, 347422, 86445, 900037, 236838, 21829, 732614, 663940, 548445, 963612,
				128018, 560295, 882335, 937034, 393537, 52270, 828055, 418888, 787891, 260217, 624567, 730986, 494593,
				981519, 979772, 256588, 144998, 654322, 725320, 198143, 191234, 565458, 338340, 464037, 308769, 972225,
				947250, 608665, 967575, 349586, 183057, 114122, 22041, 151281, 720171, 225368, 418085, 251024, 88861,
				850808, 683909, 561350, 545229, 523509, 980738, 114795, 227461, 860334, 404069, 722978, 542669, 67684,
				791879, 707995, 548963, 543661, 613039, 81744, 226198, 458404, 847110, 484806, 428728, 165812, 140992,
				945912, 664338, 850167, 216140, 669174, 97585, 462400, 862182, 411859, 460266, 651121, 749453, 545555,
				290654, 62288, 787148, 512619, 111962, 806586, 356054, 459344, 978283, 51969, 794169, 786456, 497368,
				201410, 339855, 258680, 872333, 164744, 544971, 330290, 758596, 756922, 754278, 519503, 17950, 204928,
				126283, 878028, 659778, 879780, 161657, 870775, 255551, 238851, 946852, 451341, 560309, 985212,
				750899 };

		int[] drives = { 898953, 558107, 27174, 552639, 65220, 94174, 464036, 343741, 909426, 282495, 538824, 390817,
				497925, 798525, 105498, 372017, 656929, 451799, 822289, 397471, 380506, 93430, 775787, 441172, 964694,
				195654, 203813, 186766, 523448, 94058, 287203, 356752, 793034, 757653, 577724, 276504, 634726, 312420,
				798094, 642820, 396060, 195885, 915297, 897160, 533149, 520308, 157991, 447704, 696056, 557946, 793441,
				166072, 316834, 613612, 857373, 363183, 906348, 897389, 276967, 168893, 983744, 507166, 140744, 598248,
				202062, 33392, 184267, 363776, 894192, 732801, 654440, 820563, 152139, 313233, 440423, 798774, 615437,
				967974, 83483, 857067, 882616, 117671, 803785, 739897, 505321, 319739, 967345, 988639, 417856, 485469,
				984333, 122462, 668071, 725349, 634815, 323084, 165993, 997303, 882127, 980004, 427586, 656282, 162270,
				129856, 12611, 687016, 559882, 93052, 527519, 29371, 719516, 823144, 890459, 209801, 79425, 379113,
				731662, 973677, 187455, 336917, 858371, 296557, 819249, 918415, 540916, 110774, 710403, 759754, 314421,
				988289, 471275, 901500, 821822, 651815, 459369, 314132, 357879, 254380, 494324, 819440, 828436, 880021,
				335284, 525554, 173801, 244395, 712175, 112969, 826165, 87200, 100661, 719240, 239929, 420214, 142004,
				905564, 348020, 739838, 450453, 191304, 748996, 613916, 651295, 435604, 621069, 577380, 352455, 738236,
				841638, 806378, 471394, 843928, 979326, 254033, 634285, 31123, 126294, 739462, 676330, 106368, 325178,
				314991, 686482, 3818, 69657, 681824, 174921, 167170, 855931, 655431, 227231, 991967, 837230, 72688,
				279340, 77096, 643027, 340457, 694307, 866582, 512771, 215579, 305380, 360460, 212693, 68521, 33197,
				763328, 304015, 408399, 653310, 759420, 938517, 903812, 871401, 232816, 766238, 807578, 788625, 59108,
				665135, 899050, 260346, 650916, 907400, 874424, 670884, 189, 560567, 169120, 111015, 389848, 447157,
				379589, 460462, 226782, 864759, 381698, 546772, 128878, 380487, 412855, 977021, 802536, 110746, 479178,
				422644, 18005, 42035, 421539, 740071, 27182, 918284, 966462, 280101, 127483, 858536, 707848, 292285,
				972996, 910976, 826226, 754132, 699473, 805089, 839651, 18011, 982020, 963028, 621485, 726835, 559311,
				304820, 628380, 829582, 532796, 281585, 635233, 872951, 449944, 112606, 218493, 703845, 120275, 540821,
				68357, 96557, 263376, 241949, 46134, 12407, 567299, 468874, 283893, 301334, 824721, 598493, 74258,
				297305, 226403, 299987, 730411, 743361, 598944, 48154, 64506, 903099, 877438, 852456, 877460, 667956,
				330483, 593356, 340483, 892504, 989252, 185372, 626318, 78987, 531437, 239565, 838341, 794758, 285355,
				34679, 429280, 582939, 267837, 995662, 789339, 855889, 573479, 521564, 658974, 63656, 252365, 831561,
				220275, 599114, 488485, 114959, 737732, 93879, 525359, 909832, 32654, 669352, 868748, 829474, 64702,
				879177, 956040, 571902, 25148, 517563, 694607, 430525, 82226, 317018, 910882, 434694, 464538, 774054,
				137555, 602060, 340893, 892725, 164862, 443480, 170621, 607227, 948322, 631450, 445347, 591831, 788980,
				702793, 639750, 237487, 676579, 512480, 131724, 104249, 234238, 384598, 786928, 487777, 970985, 652372,
				262735, 950746, 271630, 600787, 473004, 743762, 984062, 506381, 269020, 634247, 407064, 70949, 891681,
				254449, 2922, 361935, 39775, 472600, 604208, 45660, 907585, 140056, 238911, 276877, 469748, 971752,
				450567, 331422, 473078, 482150, 622660, 196142, 469850, 610918, 447569, 280747, 474396, 207040, 591001,
				516689, 537129, 5508, 854329, 7666, 49509, 219119, 833505, 36730, 844115, 108051, 284973, 338937,
				462957, 802767, 438638, 572178, 218560, 512784, 396887, 293555, 44398, 931964, 277885, 397105, 816867,
				87113, 284627, 617206, 818391, 113865, 531720, 345301, 880061, 507527, 574910, 874420, 29675, 493658,
				675573, 702417, 44864, 993041, 450699, 131519, 929637, 274794, 165242, 394665, 389961, 421924, 730025,
				411114, 882458, 907816, 671095, 714194, 258232, 608043, 674760, 309443, 296795, 823976, 718592, 955276,
				954249, 821384, 721556, 1566, 863075, 636545, 2105, 51147, 717734, 257666, 829775, 59539, 40568, 603932,
				871795, 686745, 256753, 114514, 665442, 383926, 800536, 456340, 662814, 369137, 92306, 121053, 596456,
				419043, 549708, 751348, 900525, 71024, 404331, 80199, 321154, 354852, 750020, 941938, 412769, 668724,
				646242, 678823, 646596, 362002, 888240, 593795, 598828, 10134, 502267, 636240, 138903, 913493, 115764,
				612712, 154357, 873896, 171888, 724137, 638021, 120586, 741149, 902657, 530111, 66459, 829205, 534088,
				991487, 142170, 820198, 11710, 695039, 422130, 532613, 295108, 448955, 486110, 84412, 577330, 399459,
				43749, 910340, 123032, 808205, 558769, 216101, 343245, 466713, 729338, 816908, 652439, 67400, 845795,
				387480, 692649, 852034, 430028, 403989, 673119, 77633, 275444, 542657, 306383, 861937, 789163, 590419,
				446521, 226331, 798561, 384327, 822608, 450225, 857756, 579397, 916842, 759523, 431083, 98896, 318939,
				889853, 582330, 12313, 371257, 370136, 601210, 27427, 705745, 393063, 688561, 525932, 374638, 511797,
				166898, 165666, 430627, 645886 };
		int spent = 0;

		spent = getMoneySpent(keyboards, drives, b);

		System.out.println(spent);

	}

	/**
	 * 
	 * @param keyboards
	 * @param drives
	 * @param b
	 * @return
	 * 
	 *         if drives is greather than keyboards
	 * 
	 *         3 -> 3+5, 3+2, 3+8 1 -> 1+5, 1+2, 1+8
	 * 
	 *         if not
	 * 
	 *         using viceverse
	 * 
	 *         5+3 = 8 > 10, not -> continue
	 * 
	 *         5+1 = 6 > 10, not -> continue
	 * 
	 */
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		/*
		 * Write your code here.
		 */

		int spent = 0;
		int sum = 0;
		int aux = 0;

		if (keyboards.length > drives.length) {

			aux = drives[0] + keyboards[0];

			if (aux > b && drives.length == 1 && drives[0] > b && keyboards[0] > b) {
				aux = -1;

			} else if (aux > b && drives[0] > b && keyboards[0] > b) {
				aux = -1;
			}

			else if (aux > b && drives.length == 1 && drives[0] >= b) {
				aux = -1;
			}

			else if (aux > b && drives.length == 1 && keyboards[0] >= b) {
				aux = -1;
			}

			else if (aux == b && b < drives[0] || b < keyboards[0]) {
				spent = b - 1;
				aux = spent;

			}
			else if (b < drives[0] || b < keyboards[0]) {
				spent = b - 1;
				aux = spent;
			} 
			
			else {

				for (int i = 0; i < keyboards.length; i++) {
					int d = keyboards[i];
					for (int j = 0; j < drives.length; j++) {
						int c = drives[j];
						sum = d + c;
						if (sum < b) {
							if (sum >= aux) {
								aux = sum;
							}
						} else {

						}
					}

				}
			}

		} else {

			// take a first sum
			aux = drives[0] + keyboards[0];

			if (aux > b && drives.length == 1 && drives[0] > b && keyboards[0] > b) {
				aux = -1;

			} else if (aux > b && drives[0] > b && keyboards[0] > b) {
				aux = -1;
			}

			else if (aux > b && drives.length == 1 && drives[0] >= b) {
				aux = -1;
			}

			else if (aux > b && drives.length == 1 && keyboards[0] >= b) {
				aux = -1;
			}

			else if (aux == b && b < drives[0] || b < keyboards[0]) {
				spent = b - 1;
				aux = spent;

			}
			else if (b < drives[0] || b < keyboards[0]) {
				spent = b - 1;
				aux = spent;

			} 

			
			else {
				for (int i = 0; i < drives.length; i++) {
					int d = drives[i];
					for (int j = 0; j < keyboards.length; j++) {
						int c = keyboards[j];
						sum = d + c;
						if (sum < b) {
							if (sum >= aux) {
								aux = sum;
							}
						} else {

						}
					}

				}

			}

		}

		return aux;

	}

}