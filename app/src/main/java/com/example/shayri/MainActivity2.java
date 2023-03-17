package com.example.shayri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {
    String lvshayri[]={"तेरे ख्याल से खुद को छुपा के देखा है"+"\n" +
            "दिल-ओ-नजर को रुला-रुला के देखा है," +"\n"+
            "तू नहीं तो कुछ भी नहीं है तेरी कसम," +"\n"+
            "ैंने कुछ पल तुझे भुला के देखा है।",
            "हम आपकी हर चीज़ से प्यार कर लेंगे," +
                    "आपकी हर बात पर ऐतबार कर लेंगे," +"\n"+
                    "बस एक बार कह दो कि तुम सिर्फ मेरे हो," +"\n"+
                    "हम ज़िन्दगी भर आपका इंतज़ार कर लेंगे।",
            "अगर इश्क करो तो आदाब-ए-वफ़ा भी सीखो," +"\n"+
                    "ये चंद दिन की बेकरारी मोहब्बत नहीं होती।",
            "जान-ए-मन काम तो अच्छा है मोहब्बत लेकिन," +"\n"+
                    "हमको इस काम के अंजाम से डर लगता है।",
            "जागने की भी जगाने की भी आदत हो जाए," +"\n"+
                    "काश तुझको किसी शायर से मोहब्बत हो जाए।",
            "दुनिया के सितम याद न अपनी ही वफ़ा याद," +"\n"+
                    "अब मुझको नहीं कुछ भी मोहब्बत के सिवा याद।",
            "जादू वो लफ़्ज़ लफ़्ज़ से करता चला गया," +"\n"+
                    "मीठा सा नश्तर दिल में उतरता चला गया।",
            "मैंने जान बचा के रखी है अपनी जान के लिए," +"\n"+
                    "इतना प्यार कैसे हो गया एक अनजान के लिए।",
            "नहीं जो दिल में जगह तो नजर में रहने दो," +"\n"+
                    "मेरी हयात को तुम अपने असर में रहने दो," +"\n"+
                    "मैं अपनी सोच को तेरी गली में छोड़ आया हूँ," +"\n"+
                    "मेरे वजूद को ख़्वाबों के घर में रहने दो।",
            "प्यार उस से इस कदर करता चला जाऊं," +"\n"+
                    "वो ज़ख्म दे और मैं भरता चला जाऊं," +"\n"+
                    "उस की ज़िद है कि वो मुझे मार ही डाले," +"\n"+
                    "तो मेरी भी ज़िद है कि उसपे मरता चला जाऊं।",
            "किताब-ए-दिल में भी रखा तो ताज़गी ना गई," +"\n"+
                    "तेरे ख्याल का जलवा गुलाब जैसा है।",
            "तेरे ख्याल में जब बेख्याल होता हूँ," +"\n"+
                    "जरा सी देर को ही सही बेमिसाल होता हूँ।",
            "तू हकीकत-ए-इश्क है या कोई फरेब," +"\n"+
                    "ज़िन्दगी में आती नहीं ख़्वाबों से जाती नहीं।",
            "तेरा ज़िक्र तेरी फ़िक्र तेरा एहसास तेरा ख्याल," +"\n"+
                    "तू खुदा तो नहीं फिर हर जगह क्यों है।",
            "रोज वो ख़्वाब में आते हैं गले मिलने को," +"\n"+
                    "मैं जो सोता हूँ तो जाग उठती है किस्मत मेरी।"};
    String bdshayri[]={"दिल का तोहफा दे दूँ," +"\n"+
            " या दे दूँ चाँद तारे," +"\n"+
            "जन्मदिन पे तुझे क्या दूँ पूछे मुझसे सारे," +"\n"+
            "ये ज़िंदगी तेरे नाम कर दूँ तो भी कम है," +"\n"+
            "दामन में भर दूँ मैं हर ख़ुशी तुम्हारे।",
            "ये महीना ये दिन ये तारीख जब जब आई," +"\n"+
                    "हमने प्यार से जन्मदिन की महफ़िल सजाई," +"\n"+
                    "हर शम्मा पर नाम लिख दिया दोस्ती का," +"\n"+
                    "इसकी रोशनी में चाँद जैसी तेरी सूरत समाई।",
            "लिख दूँ तुम्हारी उम्र मैं चाँद-सितारों से," +"\n"+
                    "जन्मदिन मनाऊं तुम्हारा फूल-बहारों से," +"\n"+
                    "हर एक खूबसूरती दुनिया की लाकर दे दूं," +"\n"+
                    "महफिलें सजा दूँ हसीं-हसीं नजारों की।",
            "हर दिन से प्यारा लगता है ये खास दिन," +"\n"+
                    "जिसे हम बिताना नहीं चाहते आपके बिन," +"\n"+
                    "वैसे तो दिल देता है सदा दुआ आपको,फ" +"\n"+
                    "िर भी कहते हैं मुबारक हो जन्मदिन।",
            "आ तेरी उम्र में लिख दूँ 🌙✨चाँद-सितारों🌙✨ से," +"\n"+
                    "तेरा जन्मदिन मनाऊँ फूलों से बहारों से…," +"\n"+
                    "हर एक खूबसूरती दुनिया 🌎 से मैं ले आउ," +"\n"+
                    "सजाऊ में ये महेफिल हर हसिन नजारों से…🎀," +"\n"+
                    "🎁जन्मदिन की ढेर सारी शुभकामनायें…🎂🎂",
            "आज ही के दिनएक चाँद उतर के आया था," +"\n"+
                    "ऊपर वाले ने बड़ी फुर्सत सेमेरे प्यार बनाया था," +"\n"+
                    "जन्मदिन मुबारक हो",
            "एक दुआ 🙏 माँगते है हम अपने भगवान से," +"\n"+
                    "चाहते है आपकी खुशी पूरे ईमान से," +"\n"+
                    "सब हसरतें पूरी हो आपकी" +"\n"+
                    "और आप मुस्कुराएँ दिलो जान 💗 से…," +"\n"+
                    "🎂🎀🎁*Happy Birthday*🎂🎂",
            "चाँद की तरह तू जगमगाए," +
                    "पंछियों की तरह गुनगुनाये," +"\n"+
                    "तेरे जन्मदिन पर दुआ करते हैं," +"\n"+
                    "तू जो चाहे वो तुझे मिल जाये" +"\n"+
                    "।Happy Birthday",
            "मैं लिख दू तुम्हारी उम्र चाँद सितारों से…," +"\n"+
                    "मैं मनाऊ जन्मदिन तुम्हारा फूल बहारों से," +"\n"+
                    "ऐसी खूबसूरती दुनिया 🌎 से लेकर आऊ मैंके," +"\n"+
                    " सारी महफ़िल सज जाए हसीं नजारो से," +"\n"+
                    "Happy 🎂 Birthday 🎂to You…🎀🎁",
            "आसमान की बुलंदियों पर नाम हो आपका," +"\n"+
                    "चांद की धरती पर मुकाम हो आपका…," +"\n"+
                    "हम तो रहते है छोटी-सी 🌎 दुनिया में," +"\n"+
                    "पर ईश्वर करें सारा जहान हो आपका…," +"\n"+
                    "🎂जन्मदिन की बहोत बहोत शुभकामनायें 🎂🎀🎁",
            "ज़िंदगी की कुछ खास दुआएँ🙏 ले लो ," +"\n"+
                    "हमसेजन्मदिन पर कुछ नजराने ले लो," +"\n"+
                    " हमसेभर दे रंग जो तेरे जीवन के पलो में," +"\n"+
                    "आज वो हसी मुबारक बाद ले लो हमसे…🎀🎁",
            "#Life का हर #Goal रहे आपका #Clear," +"\n"+
                    "तुम #Success पाओ Without any #Fear," +"\n"+
                    "हर पल जियो Without any #Tear," +"\n"+
                    "Enjoy your day my #Dear," +"\n"+
                    "🎂HAPPY BIRTHDAY🎂🎀🎁",
            "ख्वाहिशों के समंदर के सब मोती तेरे नसीब हो," +"\n"+
                    "तेरे चाहने वाले हमसफ़र तेरे हरदम करीब हों," +"\n"+
                    "कुछ यूँ उतरे तेरे लिए रहमतों का मौसम," +"\n"+
                    "कि तेरी हर 🙏 दुआ हर ख्वाहिश कबूल हो।," +"\n"+
                    "🎂जन्मदिन की बधाई!🎂🎀🎁",
            "एक दुआ 🙏 है कोई गिला नहीं हो," +"\n"+
                    "ऐसा प्यार का फूल जो आज तक खिला ना हो," +"\n"+
                    "आज मिले वो सब आपको," +"\n"+
                    "जो आज तक कभी किसी को मिला ना हो…," +"\n"+
                    "🎂H’py B’day to u🎂🎀🎁",
            "जन्मदिन के ये ख़ास लम्हें मुबारक," +"\n"+
                    "आँखों में बसे नए ख्वाब मुबारक," +"\n"+
                    "जिंदगी जो लेकर आई है आपके लिए आज..," +"\n"+
                    "वो तमाम खुशियों की हंसीं सौगात मुबारक!" +"\n"+
                    "Happy Birthday🎂🎀🎁",
            "हमारी एक प्यारी सी दुआ 🙏 है," +"\n"+
                    "आपकी हर दुआ 🙏 पुरी हो," +"\n"+
                    "जो प्यारी चाहते होती है सपनों में," +"\n"+
                    "वो सारी चाहते आपकी पुरी हो…🎀," +"\n"+
                    "🎁Janmadin Mubarak!🎂"};
    String fdshayri []={"ज़िन्दगी हर पल कुछ खास नहीं होती," +"\n"+
            "फूलों की खुशबू हमेशा पास नहीं होती," +"\n"+
            "मिलना हमारी तक़दीर में था वरना," +"\n"+
            "इतनी प्यारी दोस्ती इत्तेफाक नहीं होती।",
            "तुम दोस्त बनके ऐसे आए ज़िन्दगी में,क" +"\n"+
                    "ि हम ये जमाना ही भूल गये," +"\n"+
                    "तुम्हें याद आए न आए हमारी कभी," +"\n"+
                    "पर हम तो तुम्हें भुलाना ही भूल गये।",
            "ज़िन्दगी के तूफानों का साहिल है दोस्ती," +"\n"+
                    "दिल के अरमानों की मंज़िल है दोस्ती," +"\n"+
                    "ज़िन्दगी भी बन जाएगी अपनी तो जन्नत," +"\n"+
                    "अगर मौत आने तक साथ दे दोस्ती।",
            "दुश्मनों से मोहब्बत होने लगी है मुझे," +"\n"+
                    "जैसे-जैसे दोस्तों को आजमाता जा रहा हूँ।",
            "दाग दुनिया ने दिए ज़ख्म ज़माने से मिले," +"\n"+
                    "हमको तोहफे ये तुम्हें दोस्त बनाने से मिले।",
            "दोस्त होकर भी महीनों नहीं मिलता मुझसे," +"\n"+
                    "उस से कहना कि कभी ज़ख्म लगाने आये।",
            "आप जिसके वास्ते मुझसे किनारा कर गए," +"\n"+
                    "आपसे बच कर वही मुझको इशारा कर गए।",
            "तूफानों की दुश्मनी से न बचते तो खैर थी," +"\n"+
                    "साहिल से दोस्तों के भरम ने डुबो दिया।",
            "साथ रहते यूँ ही वक़्त गुजर जायेगा," +"\n"+
                    "दूर होने के बाद कौन किसे याद आयेगा," +"\n"+
                    "जी लो ये पल जब तक साथ है दोस्तों," +"\n"+
                    "कल क्या पता वक़्त कहाँ ले के जायेगा।",
            "तन्हाई सी थी दुनिया की भीड़ में," +"\n"+
                    "सोचा कोई अपना नहीं तकदीर में," +"\n"+
                    "एक दिन जब दोस्ती की आप से तो यूँ लगा," +"\n"+
                    "रिश्तों से बड़ी चाहत और क्या होगी",
            "दोस्ती से बड़ी इबादत और क्या होगी,जि" +"\n"+
                    "से दोस्त मिल सके कोई आप जैसा," +"\n"+
                    "उसे ज़िन्दगी से कोई और शिकायत क्या होगी।" +"\n"+
                    "कुछ ख़ास था मेरे हाथ की लकीर में।",
            "कल न हम होंगे न कोई गिला होगा," +"\n"+
                    "सिर्फ सिमटी हुयी यादों का सिलसिला होगा," +"\n"+
                    "जो लम्हे हैं उन्हें हँसकर बिता ले दोस्त," +"\n"+
                    "जाने कल ज़िन्दगी का क्या फैसला होगा।",
            "उम्मीद ऐसी हो जो जीने को मजबूर करे," +"\n"+
                    "राह ऐसी हो जो चलने को मजबूर करे," +"\n"+
                    "महक अपनी दोस्ती की कम न हो कभी," +"\n"+
                    "दोस्ती ऐसी हो जो मिलने को मजबूर करे।",
            "हम दोस्त बनाकर किसी को रुलाते नहीं," +"\n"+
                    "दिल में बसाकर किसी को भुलाते नहीं," +"\n"+
                    "हम तो दोस्त के लिए जान भी दे सकते हैं," +"\n"+
                    "और तुम सोचते हो हम दोस्ती निभाते नहीं।",
            "हम वो फूल हैं जो रोज-रोज नहीं खिलते," +"\n"+
                    "यह वो होंठ हैं जो कभी नहीं सिलते," +"\n"+
                    "हमसे बिछड़ोगे तो एहसास होगा तुम्हें," +"\n"+
                    "हम वो दोस्त हैं जो दोबारा नहीं मिलते।"};
    String rmshayri []={"इससे ज़्यादा तुझे और कितना करीब लाऊँ मैं," +"\n"+
            "कि तुझे दिल में रख कर भी मेरा दिल नहीं भरता।",
            "हक़ीक़त ना सही तुम ख़्वाब बन कर मिला करो," +"\n"+
                    "भटके मुसाफिर को चांदनी रात बनकर मिला करो।",
            "कभी लफ्ज़ भूल जाऊं कभी बात भूल जाऊं," +"\n"+
                    "तूझे इस कदर चाहूँ कि अपनी जात भूल जाऊं," +"\n"+
                    "कभी उठ के तेरे पास से जो मैं चल दूँ," +"\n"+
                    "जाते हुए खुद को तेरे पास भूल जाऊं।",
            "इस से पहले कि सारे ख्वाब टूट जायें," +"\n"+
                    "और ये ज़िन्दगी हम से रूठ जाए," +"\n"+
                    "एक दूसरे के प्यार में खो जायें इस कदर," +"\n"+
                    "कि हम सारे गमों को भूल जायें।",
            "तुम मिल गए तो मुझ से नाराज है खुदा," +"\n"+
                    "कहता है कि तू अब कुछ माँगता नहीं है।",
            "मोहब्बत पनप रही है दिल में तेरे लिए," +"\n"+
                    "जुबाँ से न सही तुम निगाहों से समझ लो।",
            "मेरी बाँहों में बहकने की सज़ा भी सुन ले," +"\n"+
                    "अब बहुत देर में आज़ाद करूँगा तुझको।",
            "अल्फाज़ की शक्ल में एहसास लिखा जाता है," +"\n"+
                    "यहाँ पर पानी को प्यास लिखा जाता है," +"\n"+
                    "मेरे जज़्बात वाकिफ से है मेरी कलम भी," +"\n"+
                    "प्यार लिखूं तो तेरा नाम लिखा जाता है।",
            "एक सपने की तरह तुझे सजा के रखूं," +"\n"+
                    "चाँदनी रात की नजरों से छुपा के रखूं," +"\n"+
                    "मेरी तक़दीर में तेरा साथ नहीं है वरना," +"\n"+
                    "सारी उम्र तुझे अपना बना के रखूँ।",
            "तुम नहीं होते हो तो बहुत खलता है," +"\n"+
                    "प्यार कितना है तुमसे पता चलता है।",
            "उम्र निसार दूँ तेरी उस एक नज़र पे," +"\n"+
                    "जो तू मुझे देखे और मैं तेरा हो जाऊं।",
            "तुझ में बात ही कुछ ऐसी है," +"\n"+
                    "दिल न दिया तुझे तो जान चली जाएगी।",
            "उदास लम्हों की न कोई याद रखना," +"\n"+
                    "तूफान में भी वजूद अपना संभाल रखना," +"\n"+
                    "किसी की ज़िंदगी की ख़ुशी हो तुम," +"\n"+
                    "बस यही सोच तुम अपना ख्याल रखना।",
            "आँखों में आँखें डालकर तुम्हारा दीदार," +"\n"+
                    "ये कशिश बयाँ करना मेरे बस की बात नही।",
            "एक शब गुजरी थी तेरे गेसुओं के छाँव में," +"\n"+
                    "उम्र भर बेख्वाबियाँ मेरा मुकद्दर हो गयीं।"};
    String ydshayri []={"मुझे कुछ भी नहीं कहना इतनी सी गुजारिश है," +"\n"+
            "बस उतनी बार मिल जाओ जितना याद आते हो।",
            "हर एक पहलू तेरा मेरे दिल में आबाद हो जाये," +"\n"+
                    "तुझे मैं इस क़दर देखूं मुझे तू याद हो जाये।",
            "हम चाहे तो भी तुझे भुला नहीं सकते," +"\n"+
                    "तेरी यादों से दामन चुरा नहीं सकते," +"\n"+
                    "तेरे बिना जीना एक पल भी मुमकिन नहीं," +"\n"+
                    "तुम्हें चाहते हैं इतना कि बता नहीं सकते।" +"\n"+
                    "मिसिंग यू...",
            "कहीं ये अपनी मोहब्बत की इन्तेहाँ तो नहीं," +"\n"+
                    "बहुत दिनों से तेरी याद भी नहीं आई।",
            "काश तू भी बन जाए तेरी यादों की तरह," +"\n"+
                    "न वक़्त देखे न बहाना बस चली आये।",
            "ढूढ़ोगे उजड़े रिश्तों में वफ़ा के खजाने," +"\n"+
                    "तुम मेरे बाद मेरी मोहब्बत को याद करोगे।",
            "दिल में आप हो और कोई खास कैसे होगा," +"\n"+
                    "यादों में आपके सिवा कोई पास कैसे होगा," +"\n"+
                    "हिचकियॉं कहती हैं आप याद करते हो," +"\n"+
                    "पर बोलोगे नहीं तो मुझे एहसास कैसे होगा?",
            "नहीं फुर्सत यकीं मानो हमें कुछ और करने की," +"\n"+
                    "तेरी यादें तेरी बातें बहुत मसरूफ़ रखती हैं।",
            "सरहदें तोड़ के आ जाती है किसी पंछी की तरह," +"\n"+
                    "ये तेरी याद है जो बंटती नहीं मुल्कों की तरह।",
            "हर रात रो-रो के उसे भुलाने लगे," +"\n"+
                    "आँसुओं में उसके प्यार को बहाने लगे," +"\n"+
                    "ये दिल भी कितना अजीब है कि," +"\n"+
                    "रोये हम तो वो और भी याद आने लगे।",
            "भूल जाना उसे मुश्किल तो नहीं है लेकिन," +"\n"+
                    "काम आसान भी हमसे कहाँ होते हैं।",
            "गुजर गई है मगर रोज याद आती है," +"\n"+
                    "वो एक शाम जिसे भूलने की हसरत है।",
            "जरूरी तो नहीं है कि तुझे आँखों से ही देखें," +"\n"+
                    "तेरी याद का आना भी तेरे दीदार से कम नहीं।",
            "आपसे दूर जाने का इरादा तो नहीं था," +"\n"+
                    "साथ-साथ रहने का भी वादा तो नहीं था," +"\n"+
                    "तुम याद आओगे ये जानते थे हम," +"\n"+
                    "पर इतना याद आओगे अंदाज़ा नहीं था।",
            "मेरे ख्वाबों का उसे कौन पता देता है," +"\n"+
                    "नींद में आ के वो अक्सर ही जगा देता है।"};
    String gmshayri []={"उठ कर देखिये इस सुबह का नजारा," +"\n"+
            "हवा है ठंडी और मौसम भी है प्यारा," +"\n"+
            "सो गया चाँद और छुप गया हर एक तारा," +"\n"+
            "कबूल करिए आप गुडमोर्निंग हमारा।",
            "चाहता हूँ कि अपने सारे अरमान भेज दूँ," +"\n"+
                    "दुआओं में अपनी तुम्हारा नाम भेज दूँ," +"\n"+
                    "दिन खिला और दिल को तुम याद आये," +"\n"+
                    "तो सोचा कि सुबह का सलाम भेज दूँ।",
            "ओस की बूँदें फूलों को भिगा रहीं हैं," +"\n"+
                    "हवा की लहरें एक ताज़गी जगा रहीं हैं," +"\n"+
                    "आइये और हो जाइये आप भी इसमें शामिल," +"\n"+
                    "एक प्यारी सी सुबह आपको बुला रही है।",
            "इस सुबह का उजाला सदा आपके साथ हो," +"\n"+
                    "दिन का हर पल आप के लिए कुछ खास हो," +"\n"+
                    "दुआ हमेशा निकलती है दिल से आप के लिए," +"\n"+
                    "ढेर साडी खुशियों का खजाना आपके पास हो।" +"\n"+
                    " सुप्रभात।।",
            "सुबह-सुबह आपको यह पैगाम देना है," +"\n"+
                    "आपको सुबह का पहला सलाम देना है," +"\n"+
                    "गुजरे सारा दिन आपका ख़ुशी-ख़ुशी," +"\n"+
                    "इस सुबह को खूबसूरत सा नाम देना है।" +"\n"+
                    "सुप्रभात।",
            "हर सुबह एक नये दिन की शुरुआत होती है," +"\n"+
                    "किसी अपने से बात हो तो खास होती है," +"\n"+
                    "हँस के प्यार से दोस्तों को सुप्रभात बोलो," +"\n"+
                    "तो दिन भर खुशियाँ अपने साथ होती हैं।",
            "फूलों की वादियों में हो तेरा बसेरा," +"\n"+
                    "सितारों के आँगन में हो घर तेरा," +"\n"+
                    "दुआ है एक दोस्त की एक दोस्त को,क" +"\n"+
                    "ि तुझसे भी खूबसूरत हो सवेरा तेरा।" +"\n"+
                    " सुप्रभात।",
            "यादों अक्सर आतीं हैं सताने के लिए," +"\n"+
                    "कोई रूठ जाता है फिर मान जाने के लिए," +"\n"+
                    "रिश्ते निभाना कोई मुश्किल तो नहीं," +"\n"+
                    "बस दिलों में प्यार चाहिए निभाने के लिए।",
            "सुबह-सुबह प्यारे से फूल खिल गए," +"\n"+
                    "पंछी भी अपने सफर पर उड़ गये," +"\n"+
                    "सूरज के आते ही तारे भी छुप गये," +"\n"+
                    "लो आप भी मीठी नींद से उठ गये।" +"\n"+
                    "सुप्रभात।",
            "सवेरे-सवेरे हो खुशियों का मेला," +"\n"+
                    "न लोगों की परवाह न दुनिया का झमेला," +"\n"+
                    "परिंदों का शोर हो और मौसम अलबेला," +"\n"+
                    "मुबारक हो आपको आज का सवेरा।",
            "सूरज निकल रहा है पूरब से," +"\n"+
                    "दिन शुरू हुआ आपकी याद से," +"\n"+
                    "कहना चाहते हैं हम आपको दिल से," +"\n"+
                    "आपका दिन अच्छा हो जाये..." +"\n"+
                    "हमारी गुड मॉर्निंग से..!!",
            "फिर सुबह एक नई रोशन हुई," +"\n"+
                    "फिर उम्मीदें नींद से झाँकती मिली," +"\n"+
                    "वक़्त का पंछी घरोंदे से उड़ा," +"\n"+
                    "अब कहाँ ले जाए तूफाँ क्या पता।" +"\n"+
                    "सुप्रभात।",
            "ऐ सूरज मेरे दोस्त को ये पैगाम देना," +"\n"+
                    "खुशी से भरा दिन हँसी की शाम हो," +"\n"+
                    "जब खोले वो सुबह-सुबह अपनी आँखें," +"\n"+
                    "तो उसके चेहरे पर प्यारी सि मुस्कान देना।",
            "रात गुजरी और महकती सुबह आई," +"\n"+
                    "दिल धड़का फिर आपकी याद आई," +"\n"+
                    "हमने महसूस किया उस हवा को," +"\n"+
                    "जो आपको छूकर हमारे पास आई।" +"\n"+
                    "सुप्रभात।",
            "सुबह की हल्की धूप कुछ याद दिलाती है," +"\n"+
                    "हर महकती खुशबू एक जादू सा जगाती है," +"\n"+
                    "कितनी भी व्यस्त क्यों ना हो यह ज़िन्दगी," +"\n"+
                    "सुबह-सुबह अपनों की याद आ ही जाती है।"};
    String gnshayri []={"रात को जब चाँद सितारे चमकते हैं," +"\n"+
            "हम हरदम आपकी याद में तड़पते हैं," +"\n"+
            "आप तो चले जाते हो छोड़कर हमें," +"\n"+
            "हम रात भर आपसे मिलने को तरसते हैं।",
            "चाँद की चाँदनी से एक पालकी बनायी है," +"\n"+
                    "ये पालकी हम ने तारों से सजाई है," +"\n"+
                    "ऐ हवा ज़रा धीरे-धीरे ही चलना," +"\n"+
                    "मेरे दोस्त को बड़ी प्यारी सी नींद आई है।" +"\n"+
                    "शुभरात्रि।",
            "ऐ चाँद मेरे दोस्त को एक तोहफा देना," +"\n"+
                    "तारों की महफ़िल के सपने दे देना," +"\n"+
                    "छुपा देना तुम अंधेरों को रौशनी से," +"\n"+
                    "इस रात के बाद एक खूबसूरत सवेरा देना।" +"\n"+
                    "गुड नाईट।",
            "तन्हा रात में जब हमारी याद सताये," +"\n"+
                    "हवा जब आपके बालों को सहलाये," +"\n"+
                    "कर लेना आँखें बंद और सो जाना," +"\n"+
                    "शायद हम आपके ख्वाबों में आ जाये।" +"\n"+
                    "शुभरात्रि।",
            "होंठ कह नहीं सकते फ़साना दिल का," +"\n"+
                    "शायद नजर से हमारी बात हो जाए," +"\n"+
                    "इस उम्मीद में करते हैं इंतज़ार रात का," +"\n"+
                    "शायद सपने में ही मुलाकात हो जाये।" +"\n"+
                    "शुभरात्रि।",
            "मिलने आयेंगे हम आपसे ख्वाबों में," +"\n"+
                    "ये जरा रौशनी के दिये बुझा दीजिए," +"\n"+
                    "अब नहीं होता इंतज़ार आपसे मुलाकात का," +"\n"+
                    "जरा अपनी आँखों के परदे गिरा दीजिए।" +"\n"+
                    "शुभरात्रि।",
            "इस कदर हम आपकी मोहब्बत में खो गए," +"\n"+
                    "एक नजर देखा और बस आपके ही हो गए," +"\n"+
                    "आँख खुली तो पता चला देखा एक सपना था," +"\n"+
                    "आँख बंद की और उसी सपने में खो गए।" +"\n"+
                    "शुभरात्रि।",
            "रोज़ आ जाते हो तुम नींद की मुंडेरों पर," +"\n"+
                    "बादलों में छुपे एक ख्वाब का मुखड़ा बन कर," +"\n"+
                    "खुद को फैलाओ कभी आसमाँ की बाँहों सा," +"\n"+
                    "तुम में घुल जाए कोई चाँद का टुकड़ा बन कर।" +"\n"+
                    "शुभरात्रि।।",
            "जाने कब आपका आँखों से इजहार होगा," +"\n"+
                    "आपके दिल में हमारे लिए प्यार होगा," +"\n"+
                    "गुजर रही है ये रात आपकी याद में," +"\n"+
                    "कभी तो आपको भी हमारा इंतज़ार होगा।" +"\n"+
                    "गुड नाईट डिअर।",
            "मीठी-मीठी यादों को दिल में सजा लेना," +"\n"+
                    "साथ गुजारे पल को पलकों में बसा लेना," +"\n"+
                    "दिल को फिर भी न मिले सुकून तो," +"\n"+
                    "मुस्कुरा के मुझे अपने सपनों में बुला लेना।",
            "चाँद तारों से रात जगमगाने लगी," +"\n"+
                    "चमेली भी खुशबू महकाने लगी," +"\n"+
                    "सो जाइये अब रात हो गई काफी," +"\n"+
                    "अब तो मुझे भी मीठी नींद आने लगी।",
            "दिल में हल्का सा शोर हो रहा है," +"\n"+
                    "बिना SMS दिल बोर सा हो रहा है," +"\n"+
                    "कहीं ऐसा तो नहीं एक प्यारा सा दोस्त," +"\n"+
                    "GOOD NIGHT किये बिना सो रहा है !",
            "रात को रात का तोहफा नहीं देते," +"\n"+
                    "फूल को फूल का तोहफा नहीं देते," +"\n"+
                    "देने को हम आपको चाँद भी दे सकते है," +"\n"+
                    "लेकिन चाँद को चाँद का तोहफा नहीं देते।" +"\n"+
                    "⭐शुभ रात्रि।🌕💕",
            "प्यारी सी रात हो," +"\n"+
                    "बस एक तू मेरे साथ हो सनम," +"\n"+
                    "बाँहों में तुम ले लो हम को," +"\n"+
                    "और मोहब्बत बेशुमार हो सनम !!",
            "“अभी अभी चाँद ने मुझसे कहा," +"\n"+
                    "बाहर निकलकर देखो कितना प्यारा नज़ारा है," +"\n"+
                    "मैंने कहा रूक पहले गुड नाईट कह दूँ उसे" +"\n"+
                    "जो दुनियां में मुझे सबसे प्यारा है ।" +"\n"+
                    "🌙Good Night ⭐"};
    String fnnyshayri []={"मोहब्बत न सही मुकदमा ही कर दे," +"\n"+
            "तारीख-दर-तारीख मुलाकात तो होगी !",
            "ऐ खुदा हिचकियों में कुछ तो फर्क डाला होता," +"\n"+
                    "अब कैसे पता करूँ किकौनसी वाली याद कर रही है !",
            "मेरा दिल भी ले गयी मेरा चैन भी ले गयी," +"\n"+
                    "हद हो गयी तब जब मैंने देखा," +"\n"+
                    "वो मेरा पाँच रूपये का पेन भी ले गयी !",
            "ट्यूशन में उसकी सीट पर," +"\n"+
                    "चॉकलेट रख आया था," +"\n"+
                    "अगले दिन वो मेरी सीट पे पैसे रख गयी !",
            "सीखा था Guitar जिसे पटाने के लिए," +"\n"+
                    "अब आर्डर आया है," +"\n"+
                    "उसी की शादी में बजाने के लिए !",
            "जब तिरछी नजरों से उन्होंने हमको देखा," +"\n"+
                    "तो हम मदहोश हो गए" +"\n"+
                    "जब पता लगा उनकी नजरें ही तिरछी हैं," +"\n"+
                    "तो हम बेहोश हो गए !",
            "हम तो निकले थे तलाश-से-इश्क में," +"\n"+
                    "अपनी तनहाईयों से लड़ कर," +"\n"+
                    "मगर गर्मी बहुत थी " +"\n"+
                    "बियर पी के वापिस आ गए !",
            "उसने जिस-जिस जगह रखे कदम," +"\n"+
                    "हमने वो जमीन चूम ली," +"\n"+
                    "और वो बेवफा घर आकर कहती है," +"\n"+
                    "आपका लड़का मिट्टी खाता है।",
            "किस किस का नाम लें अपनी बरबादी में," +"\n"+
                    "बहुत लोग आये थे दुआएं देने शादी में !",
            "जो लोग भी अपनी जिंदगी से परेशान हैं," +"\n"+
                    "मुझे कल काली पहाड़ी पर आकर मिलें," +"\n"+
                    "वहीं से धक्का दे दूंगा !😂",
            "गाली देने से इतनी लड़ाई नहीं होती,ज" +"\n"+
                    "ितना Last seen देखकर होती है ! 😜",
            "मोहब्बत कर ली तुमसे बहुत सोचने के बाद," +"\n"+
                    "अब किसी को देखना नहीं तुम्हें देखने के बाद," +"\n"+
                    "दुनिया छोड़ देंगे तुम्हें पाने के बाद," +"\n"+
                    "खुदा माफ करे इतना झूठ बोलने के बाद !",
            "आज कुछ शर्माए से लगते हो," +"\n"+
                    "सर्दी के कारण कंपकंपाये से लगते हो," +"\n"+
                    "चेहरा आपका खिल उठा है😂लगता है " +"\n"+
                    "हफ़्तों के बाद नहाये लगते हो !",
            "यारो मेरे मरने के बाद आँसू मत बहाना," +"\n"+
                    "ज्यादा याद आए तो उपर ही चले आना !",
            "किसी से दिल लगाने से अच्छा है," +"\n"+
                    "घर में झाडू पोछा लगा लो," +"\n"+
                    "कम से कम मम्मी तो खुश हो जाएँगी !"};
    String judaishayri []={"जिनसे खफा तक नहीं होते थे," +"\n"+
            "उनी से जुदा हो गये है आज हम !",
            "हर मुलाकात का अंजाम जुदाई क्यों है," +"\n"+
                    "अब तो हर वक्त यही बात सताती है हमें !",
            "जिसकी आँखों में कटी थी सदियाँ," +"\n"+
                    "उसी ने सदियों की जुदाई दी है !!",
            "जुदा हो कर भी जी रहे हैं मुद्दत से," +"\n"+
                    "कभी कहते थे दोनों कि जुदाई मार डालेगी !",
            "कट ही गई जुदाई भी कब ये हुआ कि मर गए," +"\n"+
                    "तेरे भी दिन गुजर गए मेरे भी दिन गुजर गए !!",
            "अगर मुझसे मोहब्बत नहीं तो रोते क्यों हो," +"\n"+
                    "तन्हाई में मेरे बारे में सोचते क्यों हो," +"\n"+
                    "अगर मंज़िल जुदाई है तो जाने दो मुझे," +"\n"+
                    "लौट के कब आओगे पूछते क्यों हो !",
            "किसी से जुदा होना इतना आसान होता तो,जि" +"\n"+
                    "स्म से रूह को लेने फरिश्ते नहीं आते !",
            "बहुत कुछ बदल गया मेरी ज़िंदगी में," +"\n"+
                    "एक तेरे आने के बाद फिर जाने के बाद !",
            "तेरी जुदाई भी हमें प्यार करती है," +"\n"+
                    "तेरी याद बहुत बेकरार करती है," +"\n"+
                    "वह दिन जो तेरे साथ गुज़ारे थे," +"\n"+
                    "नज़रें तलाश उनको बार-बार करती है !",
            "दिल से निकली ही नहीं शाम जुदाई वाली," +"\n"+
                    "तुम तो कहते थे बुरा वक़्त गुज़र जाता है !",
            "जुदा हुए हैं बहुत से लोग एक तुम भी सही," +"\n"+
                    "अब इतनी सी बात पे क्या जिंदगी हैरान करें !",
            "जुदा भी हो के वो एक पल कभी जुदा न हुआ," +"\n"+
                    "ये और बात है कि देखे उसे ज़माना हुआ। !",
            "इतना खुश होकर अब रोना नहीं चाहते," +"\n"+
                    "ये आलम है हमारा आप की जुदाई में !",
            "अब जुदाई के सफफर को मेरे आसान करो," +"\n"+
                    "तुम मुझे ख़्वाब में आकर न परेशान करो !," +"\n"+
            "अगर जाना ही था तो,मेरे इतना करीब क्यूँ आये !😒"};
    String bewafashayri []={"खुदा ने पूछा क्या सजा दूँ उस बेवफा को," +"\n"+
            "दिल ने कहा मोहब्बत हो जाए उसे भी," +"\n"+
            "और कोई छोड़ के चले जाये उसे भी !",
            "दिल में आने का तो रास्ता होता है पर," +"\n"+
                    "जाने का नही इस लिए जब भी कोई इंसान जाता है" +"\n"+
                    ",दिल तोड़ कर ही जाता है !",
            "तुम क्या जानो बेवफाई की हद ये दोस्त," +"\n"+
                    "वो हमसे इश्क सीखता रहा किसी और के लिए !",
            "हमको दिल से भी निकाला गया," +"\n"+
                    " फिर शहर से भी," +"\n"+
                    "हमको पत्थर से भी मारा गया, " +"\n"+
                    "और जहर से भी !",
            "तेरी बेवफाई का गम तो नहीं," +"\n"+
                    "मगर तू बेवफा है दुःख ये भी कम नहीं !",
            "तुम नहीं मिले तो क्या हुआ," +"\n"+
                    "सबक तो मिल गया !",
            "जहाँ से जी ना लगे तुम वहीं बिछड़ जाना," +"\n"+
                    "मगर खुदा के लिए बेवफाई ना करना !",
            "मेरे फन को तराशा है सभी के नेक इरादों ने," +"\n"+
                    "किसी की बेवफाई ने किसी के झूठे वादों ने !",
            "बेवफा तो वो खुद हैं," +"\n"+
                    "पर इल्ज़ाम किसी और को देते हैं," +"\n"+
                    "पहले नाम था मेरा उनके लबों पर," +"\n"+
                    "अब वो नाम किसी और का लेते हैं !",
            "अपने जुल्म और सितम का हिसाब क्या दोगे," +"\n"+
                    "जब खुद बेवफा हो उसका जवाब क्या दोगे !",
            "अगर तुम अब भी मेरी हो जाओ तो मैं," +"\n"+
                    "दुनिया की हर किताब से बेवफा लफ्ज मिटा दूंगा !",
            "कुछ न मिला तो तेरा ही नाम लिखूंगा," +"\n"+
                    "ओ बेवफा मैं तुझी पर सारे इल्जाम लिखूंगा !",
            "तेरी बेवफाई ने मेरा ये हाल कर दिया है की," +"\n"+
                    "अब मैं नही रोता मुझे देख कर लोग रोते हैं !",
            "तुम साथ थी तो जन्नत थी मेरी ज़िन्दगी," +"\n"+
                    "अब तो हर साँस ज़िंदा रहने की वजह पूछती है !",
            "हमें न इश्क़ मिली न मोहब्बत मिली," +"\n"+
                    "हमको जो भी मिला बेवफा यार मिला," +"\n"+
                    "अपनी तो बन गयी बेवफ़ा ज़िन्दगी," +"\n"+
                    "हर कोई जरुरत का तलबगार मिला !"};
    ListView listView;
    ImageView imageView;
    int i,image;
    Custom_Adapter2 custom_adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        i=getIntent().getIntExtra("i",0);
        image=getIntent().getIntExtra("image",0);
      if(i==0){
         custom_adapter2=new Custom_Adapter2(MainActivity2.this,lvshayri,image);
      }
      if (i==1){
          custom_adapter2=new Custom_Adapter2(MainActivity2.this,bdshayri,image);
      }
      if (i==2){
          custom_adapter2=new Custom_Adapter2(MainActivity2.this,fdshayri,image);
      }
      if (i==3){
          custom_adapter2=new Custom_Adapter2(MainActivity2.this,rmshayri,image);
      }
      if(i==4){
          custom_adapter2=new Custom_Adapter2(MainActivity2.this,ydshayri,image);
      }
      if (i==5){
          custom_adapter2=new Custom_Adapter2(MainActivity2.this,gmshayri,image);
      }
      if (i==6){
          custom_adapter2=new Custom_Adapter2(MainActivity2.this,gnshayri,image);
      }
      if (i==7){
          custom_adapter2=new Custom_Adapter2(MainActivity2.this,fnnyshayri,image);
      }
      if (i==8){
          custom_adapter2=new Custom_Adapter2(MainActivity2.this,judaishayri,image);
      }
      if (i==9){
          custom_adapter2=new Custom_Adapter2(MainActivity2.this,bewafashayri,image);
      }
    }
}