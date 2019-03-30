## Generate_Char_By_Xor

**Usage**

`./xor.py [char] || [string]`

由笛卡尔积生成所有的排列组合

```python
>  python3 xor.py s

[*]Gernerate s by:

","^"_"
"."^"]"
"^"^"-"
"("^"["

```

```python
> python3 xor.py test

[*]Gernerate test by:

"/>,/"^"[[_["
"/>,^"^"[[_*"
"/>,)"^"[[_]"
"/>,_"^"[[_+"
"/>./"^"[[]["
"/>.^"^"[[]*"
"/>.)"^"[[]]"
"/>._"^"[[]+"
"/>^/"^"[[-["
"/>^^"^"[[-*"
"/>^)"^"[[-]"
"/>^_"^"[[-+"
"/>(/"^"[[[["
"/>(^"^"[[[*"
"/>()"^"[[[]"
"/>(_"^"[[[+"
"/@,/"^"[%_["
"/@,^"^"[%_*"
"/@,)"^"[%_]"
"/@,_"^"[%_+"
"/@./"^"[%]["
"/@.^"^"[%]*"
"/@.)"^"[%]]"
"/@._"^"[%]+"
"/@^/"^"[%-["
"/@^^"^"[%-*"
"/@^)"^"[%-]"
"/@^_"^"[%-+"
"/@(/"^"[%[["
"/@(^"^"[%[*"
"/@()"^"[%[]"
"/@(_"^"[%[+"
"/^,/"^"[;_["
"/^,^"^"[;_*"
"/^,)"^"[;_]"
"/^,_"^"[;_+"
"/^./"^"[;]["
"/^.^"^"[;]*"
"/^.)"^"[;]]"
"/^._"^"[;]+"
"/^^/"^"[;-["
"/^^^"^"[;-*"
"/^^)"^"[;-]"
"/^^_"^"[;-+"
"/^(/"^"[;[["
"/^(^"^"[;[*"
"/^()"^"[;[]"
"/^(_"^"[;[+"
"/_,/"^"[:_["
"/_,^"^"[:_*"
"/_,)"^"[:_]"
"/_,_"^"[:_+"
"/_./"^"[:]["
"/_.^"^"[:]*"
"/_.)"^"[:]]"
"/_._"^"[:]+"
"/_^/"^"[:-["
"/_^^"^"[:-*"
"/_^)"^"[:-]"
"/_^_"^"[:-+"
"/_(/"^"[:[["
"/_(^"^"[:[*"
"/_()"^"[:[]"
"/_(_"^"[:[+"
"^>,/"^"*[_["
"^>,^"^"*[_*"
"^>,)"^"*[_]"
"^>,_"^"*[_+"
"^>./"^"*[]["
"^>.^"^"*[]*"
"^>.)"^"*[]]"
"^>._"^"*[]+"
"^>^/"^"*[-["
"^>^^"^"*[-*"
"^>^)"^"*[-]"
"^>^_"^"*[-+"
"^>(/"^"*[[["
"^>(^"^"*[[*"
"^>()"^"*[[]"
"^>(_"^"*[[+"
"^@,/"^"*%_["
"^@,^"^"*%_*"
"^@,)"^"*%_]"
"^@,_"^"*%_+"
"^@./"^"*%]["
"^@.^"^"*%]*"
"^@.)"^"*%]]"
"^@._"^"*%]+"
"^@^/"^"*%-["
"^@^^"^"*%-*"
"^@^)"^"*%-]"
"^@^_"^"*%-+"
"^@(/"^"*%[["
"^@(^"^"*%[*"
"^@()"^"*%[]"
"^@(_"^"*%[+"
"^^,/"^"*;_["
"^^,^"^"*;_*"
"^^,)"^"*;_]"
"^^,_"^"*;_+"
"^^./"^"*;]["
"^^.^"^"*;]*"
"^^.)"^"*;]]"
"^^._"^"*;]+"
"^^^/"^"*;-["
"^^^^"^"*;-*"
"^^^)"^"*;-]"
"^^^_"^"*;-+"
"^^(/"^"*;[["
"^^(^"^"*;[*"
"^^()"^"*;[]"
"^^(_"^"*;[+"
"^_,/"^"*:_["
"^_,^"^"*:_*"
"^_,)"^"*:_]"
"^_,_"^"*:_+"
"^_./"^"*:]["
"^_.^"^"*:]*"
"^_.)"^"*:]]"
"^_._"^"*:]+"
"^_^/"^"*:-["
"^_^^"^"*:-*"
"^_^)"^"*:-]"
"^_^_"^"*:-+"
"^_(/"^"*:[["
"^_(^"^"*:[*"
"^_()"^"*:[]"
"^_(_"^"*:[+"
")>,/"^"][_["
")>,^"^"][_*"
")>,)"^"][_]"
")>,_"^"][_+"
")>./"^"][]["
")>.^"^"][]*"
")>.)"^"][]]"
")>._"^"][]+"
")>^/"^"][-["
")>^^"^"][-*"
")>^)"^"][-]"
")>^_"^"][-+"
")>(/"^"][[["
")>(^"^"][[*"
")>()"^"][[]"
")>(_"^"][[+"
")@,/"^"]%_["
")@,^"^"]%_*"
")@,)"^"]%_]"
")@,_"^"]%_+"
")@./"^"]%]["
")@.^"^"]%]*"
")@.)"^"]%]]"
")@._"^"]%]+"
")@^/"^"]%-["
")@^^"^"]%-*"
")@^)"^"]%-]"
")@^_"^"]%-+"
")@(/"^"]%[["
")@(^"^"]%[*"
")@()"^"]%[]"
")@(_"^"]%[+"
")^,/"^"];_["
")^,^"^"];_*"
")^,)"^"];_]"
")^,_"^"];_+"
")^./"^"];]["
")^.^"^"];]*"
")^.)"^"];]]"
")^._"^"];]+"
")^^/"^"];-["
")^^^"^"];-*"
")^^)"^"];-]"
")^^_"^"];-+"
")^(/"^"];[["
")^(^"^"];[*"
")^()"^"];[]"
")^(_"^"];[+"
")_,/"^"]:_["
")_,^"^"]:_*"
")_,)"^"]:_]"
")_,_"^"]:_+"
")_./"^"]:]["
")_.^"^"]:]*"
")_.)"^"]:]]"
")_._"^"]:]+"
")_^/"^"]:-["
")_^^"^"]:-*"
")_^)"^"]:-]"
")_^_"^"]:-+"
")_(/"^"]:[["
")_(^"^"]:[*"
")_()"^"]:[]"
")_(_"^"]:[+"
"_>,/"^"+[_["
"_>,^"^"+[_*"
"_>,)"^"+[_]"
"_>,_"^"+[_+"
"_>./"^"+[]["
"_>.^"^"+[]*"
"_>.)"^"+[]]"
"_>._"^"+[]+"
"_>^/"^"+[-["
"_>^^"^"+[-*"
"_>^)"^"+[-]"
"_>^_"^"+[-+"
"_>(/"^"+[[["
"_>(^"^"+[[*"
"_>()"^"+[[]"
"_>(_"^"+[[+"
"_@,/"^"+%_["
"_@,^"^"+%_*"
"_@,)"^"+%_]"
"_@,_"^"+%_+"
"_@./"^"+%]["
"_@.^"^"+%]*"
"_@.)"^"+%]]"
"_@._"^"+%]+"
"_@^/"^"+%-["
"_@^^"^"+%-*"
"_@^)"^"+%-]"
"_@^_"^"+%-+"
"_@(/"^"+%[["
"_@(^"^"+%[*"
"_@()"^"+%[]"
"_@(_"^"+%[+"
"_^,/"^"+;_["
"_^,^"^"+;_*"
"_^,)"^"+;_]"
"_^,_"^"+;_+"
"_^./"^"+;]["
"_^.^"^"+;]*"
"_^.)"^"+;]]"
"_^._"^"+;]+"
"_^^/"^"+;-["
"_^^^"^"+;-*"
"_^^)"^"+;-]"
"_^^_"^"+;-+"
"_^(/"^"+;[["
"_^(^"^"+;[*"
"_^()"^"+;[]"
"_^(_"^"+;[+"
"__,/"^"+:_["
"__,^"^"+:_*"
"__,)"^"+:_]"
"__,_"^"+:_+"
"__./"^"+:]["
"__.^"^"+:]*"
"__.)"^"+:]]"
"__._"^"+:]+"
"__^/"^"+:-["
"__^^"^"+:-*"
"__^)"^"+:-]"
"__^_"^"+:-+"
"__(/"^"+:[["
"__(^"^"+:[*"
"__()"^"+:[]"
"__(_"^"+:[+"

```