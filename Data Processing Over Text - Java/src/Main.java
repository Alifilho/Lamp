import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
         //Inserção da matricula para ser lida
         String text = " \n" +
                "\n" +
                "(Matrícula | Folha Registro de Imóveis e Anexos /f=\n" +
                "40.0LL | OL São José dos Campos - S.P.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Em 26 de Dezembro ae 19 80.\n" +
                "\n" +
                "LIVRO NÚMERO DOIS REGISTRO GERAL 4\n" +
                "\n" +
                " \n" +
                "\n" +
                "Imóvel: Ed. Alexandre Magno - Rua Esperança nº 55 -\n" +
                "o N\n" +
                "Imóvel:- APARTAMENTO nº 54, localizado no 5º andar, e respecti-\n" +
                "\n" +
                "va garagem nº 54, localizada no andar térreo e indissoluvelmentie\n" +
                "\n" +
                " \n" +
                "\n" +
                "ligada ao apartamento, no Edifício Alexandre Magno, nesta cida-\n" +
                "de, comarca e circunscrição imobiliária de São José dos Campos,\n" +
                "à Rua Esperança nº 55, composto de hall de entrada, sala, living\n" +
                "tres dormitórios, dois banheiros sociais, copa-cozinha, área de\n" +
                "serviço e banheiro de empregada, com a área exclusiva de 88,50-\n" +
                "m2., e comum de 43,00m2., e área de garagem de 19,65m2., totalil\n" +
                "zando a área global de 151,15m2., cabendo-lhe a fração ideal de\n" +
                "2, 7778% e cota de participação de 33,33m2. no terreno; e situa-\n" +
                "se na parte posterior e lateral direita do edifício, relativa -\n" +
                "mente à Rua Esperança e confronta à direita com o terreno do E-\n" +
                "difídio e rua Prof. Joaquim de Andrade Meirelles; à esquerda +\n" +
                "com o apartamento 53; & frente com'o poço de iluminação e caixa\n" +
                "de escadas e aos fundos com terreno do edifício; estando o refe\n" +
                "rido imóvel inscrito na Prefeitura local, com a inscrição imobil\n" +
                "liéria nº 42,040.039.\n" +
                "Proprietários:- CASTOR ENGENHARIA E COMERCIO S/A., legalmente -\n" +
                "constituída, com séde e fôro nesta cidade, à Avenida Francisco\n" +
                "José Longo nº 511, inscrita no CGC sob nº 51.665.396/0001-27.-\n" +
                "Registro Anterior:- R.4/31.127, deste Cartório.-\n" +
                "\n" +
                "A Esc. autorizada,\n" +
                "va ri 4 É Loves dé Carvalho\n" +
                "\n" +
                "R.1/40.011 - em 26 de Dezembro de 1.980.-\n" +
                "\n" +
                "Por instrumento particular com força de escritura pública data-\n" +
                "ão de 19/12/1980, a proprietária VENDEU o imóvel pelo valôr de\n" +
                "CrBlL.474.5T77,78, & ALVARO TORRES JUNIOR, brasileiro, solteiro e\n" +
                "maior, funcionário público estadual, residente e domiciliado -\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "na cidade de Santa Branca, deste Estado, à rua João Pessõa nº\n" +
                "\n" +
                "Vide verso\n" +
                "q J\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\f \n" +
                "\n" +
                "(Matrícula oe] Registro de Imóveis e Anexos (=\n" +
                "\n" +
                "40.011 | verso! | São José dos Campos - S.P.\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Em 26 age Dezembro de 1960 .-\n" +
                "\n" +
                "(\n" +
                "\n" +
                "LIVRO NÚMERO DOIS REGISTRO GERAL\n" +
                "\n" +
                " \n" +
                "\n" +
                "Imóvel:\n" +
                "\n" +
                " \n" +
                "\n" +
                "e N\n" +
                "\n" +
                "-à Rua Joao Pessôa nº 287, RG. nº 5.400.360-SP. e GPF sob o nº\n" +
                "494,407.218/04.-\n" +
                "| À Esc. autorizada,\n" +
                "\n" +
                "Mayvitá ia pes 46 Carvalho\n" +
                "\n" +
                " \n" +
                "\n" +
                "R.2/40.011 - em-26 de Dezembro de 1.980.-\n" +
                "\n" +
                "Pelo mesmo instrumento retro referião, o adquirente hipotecou\n" +
                "o imóvel EM PRIMEIRA E ESPECIAL HIPOTECA, a-favor da CEESP., -\n" +
                "CAIXA ECONOMICA DO ESTADO DE SÃO PAULO -S/A., para garantia da\n" +
                "taáívida de (8$1.327.120,00, equivalentes nesta data a 2.000,00000\n" +
                "“VPC's do BNH, a ser paga por meio de 180 prestações mensais e\n" +
                "consecutivas do valêr inicial de (819.883,11, com juros à taxa\n" +
                "nominal de 10,0% ao ano, vencendo-se a primeira prestação em\n" +
                "18/01/1981, e demais condições constantes do título.-\n" +
                "\n" +
                "À Esc. autorizada,\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "“Av.3/40.011 - em 26 de Dezembro de 1.980.-\n" +
                "Nos termos do Dec. Lei nº 70 de 21/11/66 e RD 21/75 do BNH, fol\n" +
                "emitida, pela.credora, a Cédula Hipotecária Integral nº 066- /\n" +
                "8003/0154, série 03, aceita pelos devedores-e nela figurendo -\n" +
                "como favorecida a propria emitente.-\n" +
                "\n" +
                "A Esc. autorizada, .\n" +
                "na riÃE a Lopes Ge Carvalho\n" +
                "\n" +
                "- Avo4/L40,011 - Em 26 de agosto de 1983,-\n" +
                "Pelo instrumento particular de 11.04.1983, a credora hipotecarid\n" +
                "Caixa Econômica do Estado de S.Pauld S/hAes legalmente representa\n" +
                "da, autorizou o cancelamento do R.4 supra, bem como da cédila/\n" +
                "hipotecária integral aveérbada Sob nº 3, tendo em vista a liqui-\n" +
                "\n" +
                "continua às fls.\n" +
                "q 02 J\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\fage AP pa\n" +
                "\n" +
                "      \n" +
                "\n" +
                "As\n" +
                "$ eg\n" +
                "\n" +
                "Bo Go.\n" +
                "\n" +
                " \n" +
                "\n" +
                "[Matricula dk CFolha | Registro dê Imóveis“ e 3 Angxos, E\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "| =40.011=), =02= | São José dos Campos - sP.\n" +
                "\n" +
                "o Em de « de 19\n" +
                "“o LIVRO NÚMERO DOIS | REGISTRO GERAL *\n" +
                "móvel: “Ed. Alexandre Magno - Rua Esperança, nº 55 -\n" +
                "\n" +
                " \n" +
                "\n" +
                "fa liquidação total da dívida\n" +
                "\n" +
                " \n" +
                " \n" +
                "\n" +
                "O Escrevente Autorizaodo:-\n" +
                "\n" +
                " \n" +
                "\n" +
                "AV. 05 * em -10 de Junho de 1.985. - CASAMENTO - -\n" +
                "\n" +
                "Atendendo a requerimento datado de 21 de Maio de 1, 9853: faço a -\n" +
                "presente para constar que O proprietario ALVARO TORRES JÚNIOR, -\n" +
                "convolou núpcias em 12 de Janeiro de 1.982 com CASSIA HELENA MI-\n" +
                "\n" +
                "“sob nº 563, no livro 053,:em 21 de dezembro de 1.982, no Cartório\n" +
                "de Registro de Imóveis de Santa Branca, Estado de são: “Paulo e +\n" +
                "tcãrtidao de casamento expedida pelo Cartorio de Registro civil: -\n" +
                "| da comarca de Santa Branca, Estado de São Paulo, extraída do io\n" +
                "vro B-ll, fls. 278, termo nº 418, passando a convolanda a assi;\n" +
                "nar-se CASSIA HELENA MICHELLETTI TORRES.- .\n" +
                "\n" +
                "A escrevente autorizada, \"os AA Bos\n" +
                "\n" +
                "AE SHÍMADA CURSINO BSS SANTOS\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "- Ay, 6/40.011 - em 30 de janeiro de 1987.-\n" +
                "\n" +
                "Certifico que o imóvel objeto desta matrícula, encontra-se ca:\n" +
                "dastrado na Prefeitura Municipal desta cidade, com a inscrição\n" +
                "nº 42.040,039.00-D, conforme certidão expedida pela municipali\n" +
                "dade em 09,01.87 - Processo nº 392-5/87,-\n" +
                "\n" +
                "O esc. autorizados: o\n" +
                "ARA HAL\n" +
                "Carzfos /DEm to Saran\n" +
                "\n" +
                "Ra 7/40.011 - em 30 de janeiro de 1987,-\n" +
                "\n" +
                "Pela escritura de 16/janeiro/1987 do 2º Cartório de Notas da -\n" +
                "Comarca de Santa Brancã, deste Estado, livro nº 077 - fls. -\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Vide verso\n" +
                "A »,\n" +
                "\n" +
                "CHELLETTI, pelo regime da comunhão total de bens, na vigencia da\n" +
                "lei 6. 515/77, conforme escritura de pacto antenupcial registradg”\n" +
                "\n" +
                "et.\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\fCT nad OO o . “Mm\n" +
                "\n" +
                " \n" +
                "\n" +
                "(Matrícula | Folha ) Registro de Imóveis e Anexos (=\n" +
                "| ao.0u1 2 verso | São José dos Campos - SP,\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Em 30 de' janeiro : de 19 87\n" +
                "LIVRO NÚMERO DOIS REGISTRO GERAL\n" +
                "\n" +
                " \n" +
                "\n" +
                "Imóvel: Aya ESPERANÇA, nº 55 - EDIFICIO ALEXANDRE MAGNO -\n" +
                "e N\n" +
                "fls. B5vº a 86v8,, os proprietários Alvaro Torres Junior e sua\n" +
                "\n" +
                " \n" +
                "\n" +
                "mulher Cassia Helena Michelletti Torrês, brasileiros, casados/\n" +
                "pelo regime da comunhão de bens, na vigencia da Lei be 515/77 ,\n" +
                "conforme escritura de pacto antenupcial' registrada no Cartório\n" +
                "de Registro de Imóveis da Comarca de Santa Branca, deste Esta-\n" +
                "do, no Livro nº 03, fls. I18, sob nº R-563, em 21,12,82, ele -\n" +
                "Juiz de Direito, portador do RG, n£ 5.400,360-55P-SP, ela biõ=.\n" +
                "loga, portadora do RG, nº 8,918,526=S5P-SP, inscritos no CPF -\n" +
                "sob nº 494,407,218-04, residentes e domiciliados nesta cidade,\n" +
                "na Rua Esperanças, 55 - apt? 54, transmitiram o imóvel a RUY\n" +
                "\"| JACQUES DE MORAES e sua mulher JACIRA APARECIDA JACQUES DE\n" +
                "MORAES, brasileiros, casados pelo regime da comunhão de bens ,\n" +
                "“antes da vigência da Lei 6.515/77, ele engenheiro eletrônico ,\n" +
                "portador do RG. nº 9,294,011-5SP-SP e inscrito no CPF/MF sob -\n" +
                "ne 217.788. 848-40, ela secretária, portadora do RGe no, 4,26D0\n" +
                "404=SSP-SP e inscrita no CPF/MF sob nº 977,427.328-15, residen\n" +
                "tes e domiciliados na cidade de Campinas, deste Estado, na Rua\n" +
                "Machado de Assis,nº 160, pelo valor de CZ$. 1.200.000,00, a tá\n" +
                "tulo de permuta com o prédio residencial nº 226 da Rua Carlos/\n" +
                "de Campos, Jardim Esplanada - 28 Gleba, desta. cidade, objeto me\n" +
                "da matrícula nº 86.097 deste Cartório, de propriedade do adqui |\n" +
                "\n" +
                " \n" +
                "\n" +
                "rentea- . o\n" +
                "O esc. autorizado:\n" +
                "CapÃios Benegito Saran .\n" +
                "Re 8/40.011 - em 18 de dezembro de 1987 - = VENDA =\n" +
                "\n" +
                " \n" +
                "\n" +
                "Pelo instrumento particular com força de escritura pública, dá»\n" +
                "tado de 14 de dezembro de 1987, o ESPOLIO DE RUY JACQUES DE Mo\n" +
                "RAE£S, inscrito no CPF sob nº 217,788.B4B- 49, legalmente: repre =\n" +
                "\n" +
                "sentado, conforme Alvará Judicial datado de 26.8,87 e expedido/. ]\n" +
                "\n" +
                "continua às fls.\n" +
                "U 3 (ires) . | | )\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\f \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                ": Í . - , . , (TA.\n" +
                "[Mairicula | Ficha Registro de Imóveis e Anexos |=]\n" +
                "a “São José dos-Campos - S.P.\n" +
                "\n" +
                "Em de de 19\n" +
                "LIVRO NÚMERO DOIS. REGISTRO GERAL —\n" +
                "\n" +
                " \n" +
                "\n" +
                "Imóvel: RUA ESPERANÇA, 55 - EDIFICIO ALEXANDRE MAGNO = APTE 54 =\n" +
                "r\n" +
                "pelo Juízo de Direito da 32 Vara Cível desta comarca, nos Autos\n" +
                "\n" +
                " \n" +
                "\n" +
                "de Arrolamento dos bens deixados por falecimento de Ruy Jacques\n" +
                "de Moraes, Processo nº 1235/87, VENDEU o imovel objeto desta ma\n" +
                "trícula, pelo valor de CZ$, 2.500.000,00 ( dois milhões e qui -\n" +
                "nhentos mil cruzados ) a ALOYSIO GERSON FERRETTE GARCIA DE FI\n" +
                "GUEIREDO, engenheiro e sua mulher MARIANGELA VILLAÇA GARCIA DE\n" +
                "FIGUEIREDO, do lar, ambos brasileiros, casados pelo regime da =\n" +
                "comunhão universal de bens, antes da vigencia da Lei 6,515/77,/\n" +
                "portadores dos RG's nºs. 3,401,621-5P e 2,420,435=SP e inscri\n" +
                "tos no CPF sob nºs, 018,642,118-49 042,876.468=19, respecti\n" +
                "vamente, residentes e domiciliados nesta cidade, na Rua Esperan\n" +
                "ça, 55 = aptº 54.-\n" +
                "O esc, autorizados:\n" +
                "\n" +
                "Ca\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Re 9/40.011 - em 18 de dezembro de 1987,- = HIPOTECA = |\n" +
                "Pelo mesmo instrumento referido no R, 8, os adquirentes ALOYSIO'\n" +
                "GERSON FERRETTE GARCIA DE FIGUEIREDO e sua mulher MARITANGELA =\n" +
                "VILLAÇA GARCIA DE FIGUEIREDO, supra qualificados, hipotecaram o\n" +
                "imóvel ao transmitente EM PRIMEIRA E ESPECIAL HIPOTECA, para -\n" +
                "garantia da dívida de CZf. 1.750.000,00 ( um milhão, setecentos\n" +
                "e cinguenta mil cruzados ), pagável no prazo de 10 anos, atra =\n" +
                "ves de 120 (cento e vinte) prestações mensais e consecutivas, -.\n" +
                "do valor inicial de CZ%., 28,995,56, vencendo-se a primeira -\n" +
                "delas em 14/JANEIRO/1988, com a taxa de juros nominal de 10% ao\n" +
                "ano e a efetiva de 10,471% ao ano e demais condições constantes\n" +
                "do título,=\n" +
                "\n" +
                "O esc, autorizados\n" +
                "\n" +
                "AA\n" +
                "Ê a anetfyáto Jaran\n" +
                "\n" +
                " \n" +
                "\n" +
                "Vide versol\n" +
                "Q J\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\f \n" +
                "\n" +
                ". . . TN\n" +
                "[aco Ficha | Registro de Imóveis e Anexos |z\n" +
                "\n" +
                "40.011 | 3 verso São José dos Campos - S.P,\n" +
                "\n" +
                " \n" +
                "\n" +
                "Em de de 19\n" +
                "LIVRO NÚMERO DOIS REGISTRO GERAL\n" +
                "\n" +
                " \n" +
                "\n" +
                "Imóvel:\n" +
                "o N\n" +
                "\n" +
                "Ave 10/40,011 - em 18 de dezembro de 1987. = CESSÃO/CRÉDITO =\"\n" +
                "\n" +
                "”\n" +
                "Nos termos da clausula 162 do mesmo instrumento, o credor, com/\n" +
                "\n" +
                " \n" +
                "\n" +
                "base nos artigos 1065 e seguintes. do Código Civil Brasileiro e\n" +
                "consoante inciso III, do artigo 39, da Lei 4.380/64, CEDE E =\n" +
                "TRANSFERE, como de fato cedido e transferido têm à ITAU S/ -/\n" +
                "CRÉDITO IMOBILIÁRIO, com sede na Capital deste Estado, na Praça\n" +
                "Alfredo Egydio de Souza Aranha, 100 - Bloco B - 12º andar, ins»\n" +
                "erita no CGC/ME sob nº 62,808.977/0001-97, seus direitos credi-\n" +
                "tórios oriundos da hipoteca registrada sob nº 9 retro, ficando/\n" +
                "a credora sub=rogada em todos os direitos e ações inerentes ao\n" +
                "credito ora cedido.-\n" +
                "\n" +
                "O esc. sutorizado:\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Av. 11 — Em 14 de outubro de 2003. INCORPORAÇÃO\n" +
                "\n" +
                "Por instrumento particular referido na Av. 13, Itaú S/A Crédito Imobiliário, foi\n" +
                "incorporada pelo BANCO ITAÚ S/A - BANCO COMERCIAL DE\n" +
                "INVESTIMENTO, DE CRÉDITO AO CONSUMIDOR E DE CRÉDITO\n" +
                "IMOBILIÁRIO, nos termos da Ata da AGE de 22.12.88, devidamente arquivada na\n" +
                "JUCESP sob nº 698.550, em 20.02.89, conforme certidão expedida pela JUCESP,\n" +
                "\n" +
                " \n" +
                " \n" +
                " \n" +
                " \n" +
                "\n" +
                "Bruno César Nogueira de Almeida, auxiliar digitei.\n" +
                "\n" +
                "Luiz Antonio Andrade, escrevente conferi o instrumento,\n" +
                "\n" +
                " \n" +
                "\n" +
                "Av. 12 — Em 14 de outubro de 2003. ALTERAÇÃO\n" +
                "Por instrumento particular referido na Av. 13, o Banco Itaú S/A - Banco Comercial\n" +
                "\n" +
                "de Investimento, de Crédito ao Consumidor e de Crédito Imobiliário, alterou sua\n" +
                "razão social para BANCO ITAU S/A, de acôrdo com a Ata da AGOYE realizada em\n" +
                "\n" +
                "continua na ficha n.º 04;\n" +
                "A J\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\f \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "1º OFICIAL DE REGISTRO DE IMÓVEIS E ANEXOS\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Matrícula | Ficha SÃO JOSÉ DOS CAMPOS -\n" +
                "40.011 04 POS - SP /?\n" +
                "LIVRO NÚMERO DOIS REGISTRO GERAL\n" +
                "Imóvel:\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "27.03.89, arquivada na JUCESP sobnº 742.325, em 29.05.89, conforme se verifica da\n" +
                "“certidão exfedida pela própria JUCESP, em 12.07.89. o\n" +
                "\n" +
                "Bruno César Nogueira de Almeida, auxiliar digitei.\n" +
                "\n" +
                "   \n" +
                "\n" +
                "Luiz Antonio Andrade, escrevente conferi o instrumento,\n" +
                "\n" +
                " \n" +
                "\n" +
                "o ato praticado e assino.\n" +
                "\n" +
                " \n" +
                "\n" +
                "“Av. 13 — Em 14 de outubro de 2003. . CANCELAMENTO\n" +
                "\n" +
                ". Por Instrumento Particular Termo de Liberação de Garantia Hipotecária, passado na |.\n" +
                "\n" +
                "| cidade de São Paulo-SP em 24 de junho de 2003, o credor Banco Itaú S/A, autorizou E:\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Ras — Em 29 de novembro de 2004. VENDA |:\n" +
                "\n" +
                "Conforme Contrato por Instrumento Particular de Venda-e Compra de imóvel, Mútuo |:\n" +
                "\n" +
                "com Alienação Fiduciária em Garantia — Sistema de Financiamento Imobiliário — SFI |\n" +
                "\n" +
                "Carta de Crédito Caixa, nº 7.0351.0000169-7, passado nesta cidade em 04 de\n" +
                "novembro de 2004, Aloysio Gerson Ferrette Garcia de Figueiredo, RG nº 3:401.621- |\n" +
                "1-SSP/SP e sua mulher Mariangela Villaça Garcia de Figueiredo, RG nº 2.420.435-3- |.\n" +
                "\n" +
                "| SSP/SP, venderam o imóvel objeto desta matrícula, pelo valor de R$125.000,00, |\n" +
                "\n" +
                " \n" +
                "\n" +
                "“para JOÃO FRIGGI NETO, brasileiro, separado judicialmente, advogado, RG nº |\n" +
                "\n" +
                "| 4.993.180-5-SSP/SP e CPF/MF nº 739.230.958-72, residente e domiciliado nesta |:\n" +
                "| cidade, na Rua Peroba, nº 198. Atual inscrição imobiliária na Prefeitura Municipal 1\n" +
                "|. Jocal nº 42.0040.0039.0000. Protocolo nº 339.565, em 16 de novembro de 2004.\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\f \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "=, º RR 1º OFICIAL DE REGISTRO DE IMÓVEIS É ANEXOS\n" +
                "1 Fich 4 DIR\n" +
                "Matrícula * | - cha SÃO JOSÉ DOS CAMPOS - SP |\n" +
                "40.011 04 verso\n" +
                "LIVRO NÚMERO DOIS REGISTRO GERAL\n" +
                "Imóvel:\n" +
                "R. 15 - Em 29 de novembro de 2004. ALIENAÇÃO F IDUCIÁRIA\n" +
                "\n" +
                "Conforme Contrato referido no R. 14, João Friggi Neto, em garantia do pagamento da\n" +
                "dívida, no valor de R$75.000,00, alienou fiduciariamente o imóvel objeto da\n" +
                "- presente matrícula, para CAIXA ECON ÔMICA FEDERAL, com sede em Brasília-\n" +
                "DF, no Setor Bancário Sul, quadra 04, lotes 3/4, CNPJ/MF nº 00.360.305/0001-04,\n" +
                "dívida esta a ser paga em 180 meses, no valor inicial total de R$1.574,20, vencendo-\n" +
                "| se a primeira delas em 04 de dezembro de 2004, com taxa de juros representada pela\n" +
                "\"TR — Taxa referencial de juro acrescida de 13,7% ao ano, nominal proporcional de\n" +
                "1,141667% ao mês. Para os efeitos do artigo 24, inciso VI, da Les nº 9.514/97, foi\n" +
                "indicado o valor de R$130.000,00, atualizado monetariamente até a data do leilão,\n" +
                "com as demais cláusulas e condições constantes. do título. Protocolo nº 339.565, em\n" +
                "16 de novembro de 2004. |\n" +
                "Eu, esa) Sae Shimada Cursino dos Santos, escrevente digitei.\n" +
                "| Maria Carlota Miragaia Stockler, escrevente conferi o\n" +
                "\n" +
                "instrumento, o ato praticado e assino.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Av. 16 - Em 13 de setembro de 2007. Cancelamento\n" +
                "\n" +
                "Por Instrumento Particular referido no R. 17, a CAIXA ECONÔMICA FEDERAL,\n" +
                "- autorizou o cancelamento da alienação fiduciária registrada sob nº 15. Protocolo nº\n" +
                "| 382.259 em 27 de agosto de 2007.\n" +
                "| Eu, Michela Pires, auxiliar digitei.\n" +
                "\n" +
                "Eu, Ailton Roberto Macedo Pinto, escrevente conferi o\n" +
                "\n" +
                "instrumento, o afo praticado e assino.\n" +
                "\n" +
                " \n" +
                "\n" +
                "R. 17 - Em/13 13 de setembro de 2007. - Compra e Venda\n" +
                "Por Contrato por Instrumento Particular de Compra e Venda de Imóvel Residencial,\n" +
                "Mútuo com Obrigações, Cancelamento de Registro de Ônus e Constituição de\n" +
                "\n" +
                "Continua na Ficha n 05\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\f \n" +
                "\n" +
                "Matrícula Ficha 1º OFICIAL DE REGISTRO DE IMÓVEIS E ANEXOS\n" +
                "40.011 05 SÃO JOSÉ DOS CAMPOS - SP\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "LIVRO NÚMERO DOIS REGISTRO GERAL\n" +
                "\n" +
                " \n" +
                "\n" +
                "Imóvel:\n" +
                "\n" +
                " \n" +
                "\n" +
                "Alienação Fiduciária em Garantia - Carta de Crédito com Recursos do SBPE -\n" +
                "Sistema Financeiro da Habitação - SFH - Utilização do FGTS do Devedor/Fiduciante\n" +
                "nº 140910002424, passado nesta cidade em 21 de agosto de 2007, JOÃO FRIGGI\n" +
                "NETO vendeu o imóvel objeto desta matrícula, pelo valor de R$110.000,00 (do qual\n" +
                "foi utilizada a importância de R$41.257,53 dos recursos da conta vinculada do FGTS\n" +
                "do comprador) para CARLOS ANDRE DUTRA LOPES BALIEIRO, brasileiro,\n" +
                "engenheiro, CPF nº 070.474.577-12, RG nº 10383558-3-IFP/R]J, solteiro, maior,\n" +
                "residente e domiciliado na Rua Afonso César de Siqueira, nº 212, apto 26, São José\n" +
                "dos Campos-SP. Protocolo nº 382.259 em 27 de agosto de 2007.\n" +
                "\n" +
                "Eu Bros Michela Pires, auxiliar digitei.\n" +
                "\n" +
                "Eu, Ailton Roberto Macedo Pinto, escrevente conferi o\n" +
                "\n" +
                "instrumento, a áto praticado e assino.\n" +
                "\n" +
                " \n" +
                "\n" +
                "R. 18- Bá 13 de setembro de 2007. Alienação Fiduciária\n" +
                "\n" +
                "Por Instrumento Particular referido no R. 17, CARLOS ANDRE DUTRA LOPES\n" +
                "BALIEIRO alienou fiduciariamente o imóvel objeto desta matrícula, para CAIXA\n" +
                "ECONÔMICA FEDERAL, CNPJ nº 00.360.305/0001-04, com sede no Setor\n" +
                "Bancário Sul, quadra 4, lotes 3/4, Brasília-DF, para garantia da dívida no valor de\n" +
                "R$53.000,00, a ser paga através de 120 prestações mensais e consecutivas, no valor\n" +
                "inicial total de R$934,13, vencendo-se a primeira delas em 21/09/2007, com juros a\n" +
                "taxa nominal de 8,6488% ao ano e efetiva de 9,0000% ao ano. Para os efeitos do\n" +
                "artigo 24, inciso VI da Lei Federal nº 9.514/97 foi indicado o valor de R$120.000,00,\n" +
                "atualizado monetariamente até a data do leilão, sendo o prazo de carência para\n" +
                "notificação de 60 dias, com as demais cláusulas e condições constantes do título.\n" +
                "Protocolo nº 382.259 em 27 de agosto de 2007.\n" +
                "\n" +
                "Eu, Michela Pires, auxiliar digitei.\n" +
                "\n" +
                "Eu, Ailton Roberto Macedo Pinto, escrevente conferi o\n" +
                "instrumento, olÃto praticado e assino.\n" +
                "\n" +
                "A\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "vide verso\n" +
                "\f \n" +
                "\n" +
                "1º OFICIAL DE REGISTRO DE IMÓVEIS E ANEXOS\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Matrícula Ficha a 2\n" +
                "SÃO JOSE DOS CAMPOS - SP\n" +
                "40.011 05 verso\n" +
                "LIVRO NÚMERO DOIS REGISTRO GERAL\n" +
                "Imóvel:\n" +
                "Av. 19 - Em 22 de julho de 2010. Cancelamento\n" +
                "\n" +
                "Por Instrumento Particular de Autorização para Cancelamento da Propriedade\n" +
                "Fiduciária - Financiamento de Crédito Imobiliário, passado nesta cidade em 06 de\n" +
                "julho de 2010, CAIXA ECONÔMICA FEDERAL, autorizou o cancelamento da\n" +
                "alienação o, sob nº 18. Protocolo nº 441.845 em 06 de julho de\n" +
                "\n" +
                "2010. $\n" +
                "ao “.- Bruno Ricardo Villa, Auxiliar digitei.\n" +
                "\n" +
                "e\n" +
                "U, Maiara Marzulo Vilela Machado, Escrevente\n" +
                "conferi q instrumento, o ato praticado e assino.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Av. 20 - Em 23 de dezembro de 2013. Casamento\n" +
                "Por Instrumento Particular referido no R.21, foi autorizada a presente para constar\n" +
                "que CARLOS ANDRÉ DUTRA LOPES BALIEIRO casou-se com DANIELLE\n" +
                "FERNANDES GARCIA pelo regime da comunhão parcial de bens. O casamento foi.\n" +
                "realizado em 13 de julho de 2009, continuando ela a usar o mesmo nome, ou seja,\n" +
                "DANIELLE FERNANDES GARCIA, conforme certidão de casamento expedida\n" +
                "em 10 de dezembro de 2013, pelo Oficial de Registro Civil das Pessoas Naturais do\n" +
                "2º Subdistrito da comarca de São José dos Campos-SP, matrícula nº\n" +
                "115204.01.55.2009.2.00094.271.0014561-38. Protocolo nº 521.314 em 12 de\n" +
                "dezembro de 2013.\n" +
                "\n" +
                "Eu, Viviane Ss Borinhon dos Reis, Auxiliar digitei.\n" +
                "\n" +
                "MELL Ad Benedito de Castro Santos Júnior, Escrevente\n" +
                "\n" +
                "Wy\n" +
                "E\n" +
                "\n" +
                "conferi o instrumento, o ato praticado e assino.\n" +
                "\n" +
                " \n" +
                "     \n" +
                "\n" +
                " \n" +
                "\n" +
                "R. 21 - Em 23 de dezembro de 2013. Compra e Venda\n" +
                "Por Instrumento Particular de Compra e Venda de Imóvel com Pacto Adjeto de\n" +
                "Alienação Fiduciária em Garantia e de Outras Avenças nº 000.731.212, passado nesta\n" +
                "cidade em 09 de dezembro de 2013, CARLOS ANDRÉ DUTRA LOPES\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "continua na ficha nº 06\n" +
                "\f \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Matrícula Ficha 1º OFICIAL DE REGISTRO DE IMÓVEIS E ANEXOS\n" +
                "40.011 06 SÃO JOSÉ DOS CAMPOS - SP\n" +
                "LIVRO NÚMERO DOIS REGISTRO GERAL /\n" +
                "Imóvel:\n" +
                "\n" +
                " \n" +
                "\n" +
                "BALIEIRO, CPF nº 070.474.577-12, RG nº 10383558-3-IFP/RJ e sua mulher\n" +
                "DANIELLE FERNANDES GARCIA, CPF nº 276.872.028-30, RG nº\n" +
                "33012287-3-SSP/SP venderam o imóvel objeto desta matrícula, pelo valor de\n" +
                "R$320.000,00 para FÁTIMA MARIA AZEVEDO, brasileira, assistente social, CPF\n" +
                "nº 019.406.398-40, RG nº 9.522.968-SSP/SP, solteira, maior, residente e domiciliada\n" +
                "na Avenida Dr. João Guilhermino, nº 84 C, Centro, São José dos Campos-SP. Atual\n" +
                "inscrição imobiliária na Prefeitura Municipal local nº 42.0040.0039.0000. Protocolo\n" +
                "nº 521.314 em 12. de dezembro de 2013.\n" +
                "\n" +
                "Eu, Viviane\n" +
                "\n" +
                "five» ordinhon dos Reis, Auxiliar digitei.\n" +
                "Eu, Nua SODA\n" +
                "\n" +
                "Benedito de Castro Santos Júnior, Escrevente\n" +
                "conferi o instrumento, o ato praticado e assino.\n" +
                "\n" +
                "  \n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "R. 22 - Em 23 de dezembro de 2013. Alienação Fiduciária\n" +
                "Por Instrumento Particular referido no R.21, FÁTIMA MARIA AZEVEDO alienou\n" +
                "fiduciariamente o imóvel objeto desta matrícula, para BB ADMINISTRADORA\n" +
                "DE CONSÓRCIOS S/A, CNPJ nº 06.043.050/0001-32, com sede no Setor\n" +
                "Comercial Sul, Quadra 02, Bloco \"C\", lote 115, 5º andar, Asa Sul, Brasília-DF na\n" +
                "qualidade de administradora do Grupo de Consórcio 579, Contrato nº 778594,\n" +
                "para garantia da dívida no valor de R$144.618,00, proveniente da cota nº 8572 do\n" +
                "referido grupo, a ser paga em prestações mensais no valor de R$1.283,48,\n" +
                "vencendo-se a última em 10/10/2025, reajustável conforme previsto no contrato de\n" +
                "adesão pelo Índice Nacional de Custo da Construção, da Fundação Getúlio Vargas\n" +
                "(INCC/FGV). Para efeitos do artigo 24, inciso VI da Lei Federal nº 9.514/97 foi\n" +
                "indicado o valor de R$331.000,00 atualizado monetariamente até a data do leilão,\n" +
                "sendo o prazo de carência para notificação de 30 dias com as demais cláusulas\n" +
                "constantes no título. Protocolo nº 521.314 em 12 de dezembro de 2013.\n" +
                "\n" +
                "Eu, Viviane Alves Bordinhon dos Reis, Auxiliar digitei.\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "vide verso\n" +
                "\n" +
                " \n" +
                "\f \n" +
                "\n" +
                "Matrícula Ficha. 1º OFICIAL DE REGISTRO DE IMÓVEIS E ANEXOS\n" +
                "40.011 06 verso SÃO JOSE DOS CAMPOS - SP\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "LIVRO NÚMERO DOIS REGISTRO GERAL\n" +
                "\n" +
                " \n" +
                "\n" +
                "Imóvel:\n" +
                "\n" +
                "Eu, Da. 4 Benedito de Castro Santos Júnior, Escrevente\n" +
                "\n" +
                "conferi o instrumento, o ato praticado e assino.\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                "Av. 23 - Em 23 de dezembro de 2013. Restrições\n" +
                "Por Instrumento Particular referido no R.21, foi autorizada a presente para constar\n" +
                "que de acordo com o art. 5º, 8 5º, da Lei Federal nº 11.795/08, os direitos\n" +
                "decorrentes da alienação fiduciária objeto do R.22, bem como seus frutos e\n" +
                "rendimentos, não se comunicam com o patrimônio do administrador dos Grupos de\n" +
                "Consórcios, recaindo sobre tal direito as seguintes restrições: 1) não integram o ativo\n" +
                "do administrador; II) não respondem diretamente ou indiretamente por qualquer\n" +
                "obrigação do administrador; III) não compõem o elenco de bens e direitos do\n" +
                "administrador, para efeito de liquidação judicial ou extrajudicial; IV) não podem ser\n" +
                "dados em garantia de débito do administrador. Protocolo nº 521.314 em 12 de\n" +
                "dezembro de 2013.\n" +
                "\n" +
                "  \n" +
                "\n" +
                "Bo\n" +
                "\n" +
                "   \n" +
                "\n" +
                "dinhon dos Reis, Auxiliar digitei.\n" +
                "\n" +
                " \n" +
                "\n" +
                "À GU | Gl\n" +
                "\n" +
                "conferi o instrumento, o ato praticado e assino.\n" +
                "\n" +
                "Benedito de Castro Santos Júnior, Escrevente\n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\n" +
                " \n" +
                "\f";

        String[] array = text.split(" ");
        String proprietarix = "";

        //Indentificação das informações importantes

        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("Proprietários") || array[i].contains("Proprietário") || array[i].contains("Proprietária") || array[i].contains("Proprietárias")) {
                for (int j = 1; j < array.length; j++) {
                    char[] letras = array[i + j].toCharArray();
                    for (int b = 0; b < letras.length; b++) {
                        String s = Character.toString(letras[b]);
                        if (!s.equals(",")) {
                            proprietarix += s;
                        } else {
                            j = 1000000000;
                        }
                    }
                    proprietarix += " ";
                }
            }
        }
        String data = "";
        boolean bol = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("Em")) {
                for (int j = 1; j < array.length; j++) {
                    char[] bla = array[i + j].toCharArray();
                    for (int b = 0; b < bla.length; b++) {
                        String s = Character.toString(bla[b]);
                        if (!s.equals(".")) {
                            if (bol == false) {
                                i = 10000000;
                            } else {
                                data += s;
                            }
                        } else {
                            j = 1000000000;
                            bol = false;
                        }
                    }
                    data += " ";
                }
                if (bol == false) {
                    i = 10000000;
                }
            }
        }
        ArrayList<String> lista = new ArrayList();
        String aux = "";
        boolean con = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i].contains("R.")) {
                for (int j = i + 1; j < array.length; j++) {
                    String var = array[i];
                    if (array[j].contains("R.") || array[j].contains("Av.")) {
                        String abb = "\n -- ATO -- \n";
                        String finall = abb + var + aux + "\n FINAL \n";
                        lista.add(finall);
                        aux = "";
                        i = j;
                    } else {
                        aux += array[j] + " ";
                    }
                }
            } else if (array[i].contains("Av.")) {
                for (int j = i + 1; j < array.length; j++) {
                    String var = array[i];
                    if (array[j].contains("R.") || array[j].contains("Av.")) {
                        String abb = "\n -- ATO -- \n";
                        String finall = abb + var + aux + "\n FINAL \n";
                        lista.add(finall);
                        aux = "";
                        i = j;
                        con = false;

                    } else {
                        aux += array[j] + " ";
                    }
                }
            } else if (con == false) {
                String var = array[i-1] + "\n";
                aux = "";
                for (int o = i + 1; o < array.length; o++) {
                    aux += array[o] + " ";
                }
                String abb = "\n -- ATO -- \n";
                String finall = abb + var + aux + "\n FINAL \n";
                lista.add(finall);
                con = true;
            }else {

            }
        }
        ArrayList<String> cpf = new ArrayList();
        for (int i = 0; i < array.length; i++){
            aux = "";
            String cpfa = "";
            if(array[i].contains("CPF")){
                char[] letreiro = array[i+2].toCharArray();
                for (int j = 0 ; j < letreiro.length; j++) {
                    String aaa = Character.toString(letreiro[j]);
                    if(aaa.equals(",")){
                        break;
                    }else{
                        cpfa += aaa;
                    }

                }
                aux = array[i+1] + " " + cpfa;
                cpf.add(aux);
            }
        }
        System.out.println("Todos os CPFS encontrados: \n");
        for (int i = 0 ; i < cpf.size() ; i++){
                System.out.println("CPF " + (i + 1) + ": " + cpf.get(i));
        }
        System.out.println("------FIM DOS CPF------");

        System.out.println("\n TODOS OS ATOS \n");
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
            TimeUnit.SECONDS.sleep(2);
        }
    }
}












