<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>html_CengageBrain - Select you</name>
   <tag></tag>
   <elementGuidId>b2055a7b-89fe-4489-ac67-0d9f759edd25</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>html</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xmlns</name>
      <type>Main</type>
      <value>http://www.w3.org/1999/xhtml</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>wf-bebasneue-n4-active wf-m1m-n1-active wf-m1m-n2-active wf-m1m-n4-active wf-m1m-n5-active wf-m1m-n7-active wf-pinyonscript-n4-active wf-active</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
    
        
            
            
                CengageBrain - Select your institution
                
                
            
        
    
    
    
    
    
    
    
    
    .mboxDefault { visibility:hidden; }
    
    
    
    

    
        function searchAgain() {
            $('form#schoolSelection').attr(&quot;action&quot;, 'institution.htm?method=showSchoolSearchPage').submit();
        }

        $(document).ready(function(){
            $('input[name=institutionId]').click(function(){
                $('div#institutionSelectionRequest').removeClass(&quot;error&quot;);
            })
        });

        function createUser() {
            var institutionSelected = false;
            $('input[name=institutionId]').each(function() {
                if($(this).is(':checked')) {
                    institutionSelected = true;
                    return false; //break the loop;
                }
            });

            if(institutionSelected){
                $('form#schoolSelection').attr(&quot;action&quot;, 'createuser.htm').submit();
            } else {
                $('div#institutionSelectionRequest').addClass(&quot;error&quot;);
                return false;
            }
        }
    
#katalon{font-family:monospace;font-size:13px;background-color:rgba(0,0,0,.7);position:fixed;top:0;left:0;right:0;display:block;z-index:999999999;line-height: normal} #katalon div{padding:0;margin:0;color:#fff;} #katalon kbd{display:inline-block;padding:3px 5px;font:13px Consolas,&quot;Liberation Mono&quot;,Menlo,Courier,monospace;line-height:10px;color:#555;vertical-align:middle;background-color:#fcfcfc;border:1px solid #ccc;border-bottom-color:#bbb;border-radius:3px;box-shadow:inset 0 -1px 0 #bbb;font-weight: bold} div#katalon-elementInfoDiv {color: lightblue; padding: 5px}




    
    
    
    
    
    
    
    
    








	//This line MUST be put before calling the omniture.js file.  Do NOT move!
	var s_account= &quot;ththeichaptersstag&quot;;





    
    
        
    














     


s.pageName=&quot;CengageBrain - Select Institution&quot;
s.server=window.location.hostname


    s.channel=&quot;User&quot;


s.pageType=&quot;&quot;
s.prop4=&quot;&quot;
s.prop14=document.URL

// Added for s.prop5, s.prop5:Product [ISBN]|[Title]





    
    
        // No user account &amp; not logged in
        
           s.prop2=&quot;Anonymous&quot;
           s.eVar2=&quot;Anonymous&quot;
        

         // Added for s.prop6: User Pathing By
        
            s.prop6=&quot;Anonymous:CengageBrain - Select Institution&quot;
        

        // Added for s.hier2: member
        
            s.hier2=&quot;guest&quot;
        
    


//Added for s.eVar9: School Type

    s.eVar9=&quot;4 Year College&quot;



// Added for s.prop13, s.eVar13: Item Selected


// Added for s.prop19, s.prop19: Author


// Added for s.prop20, s.prop20: Type of Digital Product


// Added for s.prop 26: Error Messaging


// Added for s.hier1: Content Hierarchy [Product Type],,[ISBN]




/* If all else fails use GUP */
 var gup = function( name ) {
   var results = (new RegExp(&quot;[\\?&amp;]&quot;+name+&quot;=([^&amp;#]*)&quot;)).exec(window.location.href);
   if ( results == null ) {return &quot;&quot;}
   else {return results[1]}
 }
 s.campaign=gup('cid');

/* Conversion Variables */
//s.campaign=s.getQueryParam('cid');
s.state=&quot;&quot;
s.zip=&quot;&quot;

// Added for s.products: ;[IBSN];;


s.purchaseID=&quot;&quot;
s.eVar3=&quot;&quot;
s.eVar4=&quot;&quot;
s.eVar5=&quot;&quot;

/************* DO NOT ALTER ANYTHING BELOW THIS LINE ! **************/
var s_code=s.t();
if(s_code)document.write(s_code)


if(navigator.appVersion.indexOf('MSIE')>=0)document.write(unescape('%3C')+'\!-'+'-')






    
        
            
        
        
            
                
                
                    Technical Support
                
            
        
    


    
        Select Your Institution
        
            
                
                    46 Institutions were found in your search of 4 Year College within 100 miles of 45040 . Select your institution from the list below, then click Continue.
                
                
                    Please select an Institution
                
                
                    
                        
                            
                            
                                ANTIOCH COLLEGE
                                YELLOW SPRINGS,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                ART ACADEMY OF CINCINNATI
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                ATOMIC DOG PUBLISHING
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                CEDARVILLE UNIVERSITY
                                CEDARVILLE,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                CENTRAL STATE UNIV
                                WILBERFORCE,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                CHRIST COLL OF NURSING AND HLTH SCIENCES
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                CINCINNATI CHRISTIAN UNIVERSITY
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                CINCINNATI COLLEGE OF MORTUARY SCIENCE
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                CINCINNATI STATE TECH &amp; CMTY COLLEGE
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                CLTS TEST INSTITUTION
                                INDEPENDENCE,
                                
                                    KY
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                EARLHAM COLLEGE
                                RICHMOND,
                                
                                    IN
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                EMBRY RIDDLE AERO UNIV
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                GODS BIBLE SCHOOL &amp; COLLEGE
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                HEBREW UNION COLLEGE
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                INDIANA UNIV-PURDUE UNIV
                                VERSAILLES,
                                
                                    IN
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                INDIANA UNIVERSITY EAST
                                RICHMOND,
                                
                                    IN
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                INDIANA WESLEYAN U-WEST CHESTER
                                WEST CHESTER,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                KENTUCKY COMM AND TECH COLL SYSTEM
                                PARK HILLS,
                                
                                    KY
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                MIAMI UNIV
                                OXFORD,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                MIAMI UNIVERSITY
                                HAMILTON,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                MIAMI UNIVERSITY
                                MIDDLETOWN,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                MOUNT ST JOSEPH UNIV
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                MT VERNON NAZARENE U ADULT GRAD STUDIES
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                NORTHERN KENTUCKY UNIV
                                HIGHLAND HEIGHTS,
                                
                                    KY
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                PARK UNIV
                                WRIGHT-PATTERSON AFB,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                SOUTHWESTERN PUBLISHING CO.
                                MASON,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                TEMPLE BAPTIST BOOK STORE
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                THE ATHENAEUM OF OHIO
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                THOMAS MORE COLLEGE
                                CRESTVIEW HILLS,
                                
                                    KY
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                THOMAS MORE COLLEGE - BLUE ASH
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                UC COLLEGE OF APPLIED SCIENCE
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                UNION INSTITUTE
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                UNITED THEOLOGICAL SEMINARY
                                DAYTON,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                UNIV OF CINCINNATI
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                UNIV OF CINCINNATI - BLUE ASH
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                UNIV OF CINCINNATI - CLERMONT COLLEGE
                                BATAVIA,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                UNIV OF DAYTON
                                DAYTON,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                UNIV OF PHOENIX
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                URBANA UNIVERSITY
                                URBANA,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                WEBSTER UNIV
                                DAYTON,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                WILBERFORCE UNIVERSITY
                                WILBERFORCE,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                WILMINGTON COLLEGE
                                CINTI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                WILMINGTON COLLEGE
                                WILMINGTON,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                WITTENBERG UNIVERSITY
                                SPRINGFIELD,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                WRIGHT STATE UNIV
                                DAYTON,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                        
                            
                            
                                XAVIER UNIV
                                CINCINNATI,
                                
                                    OH
                                    
                                
                                - US
                            
                        
                    
                

                
                    
                        Search Again
                        Continue
                    
                
            

            
            
            
            
            
            
            
            
            
            
            
            
            
        
    


    
        
            ©D = new Date();year = D.getFullYear();document.write(year);2018 Cengage Learning
        
        
    
    





    (function () {
        var tagjs = document.createElement(&quot;script&quot;);
        var s = document.getElementsByTagName(&quot;script&quot;)[0];
        tagjs.async = true;
        tagjs.src = &quot;//s.btstatic.com/tag.js#site=iLURBAx&quot;;
        s.parentNode.insertBefore(tagjs, s);
    }());


    &lt;iframe src=&quot;//s.thebrighttag.com/iframe?c=iLURBAx&quot; width=&quot;1&quot; height=&quot;1&quot; frameborder=&quot;0&quot; scrolling=&quot;no&quot; marginheight=&quot;0&quot; marginwidth=&quot;0&quot;>&lt;/iframe>






/html[@class=&quot;wf-bebasneue-n4-active wf-m1m-n1-active wf-m1m-n2-active wf-m1m-n4-active wf-m1m-n5-active wf-m1m-n7-active wf-pinyonscript-n4-active wf-active&quot;]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[@class=&quot;wf-bebasneue-n4-active wf-m1m-n1-active wf-m1m-n2-active wf-m1m-n4-active wf-m1m-n5-active wf-m1m-n7-active wf-pinyonscript-n4-active wf-active&quot;]</value>
   </webElementProperties>
</WebElementEntity>
