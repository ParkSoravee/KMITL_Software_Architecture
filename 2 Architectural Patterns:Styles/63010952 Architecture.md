# Architectural Patterns/Styles

## Selenium WebDriver

Selenium WebDriver เป็น tool หรือ Software Testing Framework ที่เอาไว้สร้างโปรแกรมในการ Automated Testing Web Application

### Architectural Patterns/Styles

![image](https://intellipaat.com/blog/wp-content/uploads/2022/06/image-6.png)

รูปแบบสถาปัตยกรรมที่ Selenium WebDriver ใช้คือรูปแบบ **Layer Architectural**

**Selenium Client Libraries** เป็นส่วน ที่ติดต่อกับผู้ใช้งาน สามารถเขียนโปรแกรมได้หลายภาษา เช่น Python, Java, C#, Perl และอื่นๆ

**JSON WIRE PROTOCOL** ใช้ในการส่งข้อมูลระหว่าง Browser กับ Code และ Client กับ Server โดยใช้ RESTful API

**Browser Drivers**
เป็นตัวที่สั่งการ Browsers โดยแต่ละ Browsers มี driver ของตัวมันเอง โดยจะรอรับ command มาสั่ง Browser ให้ทำงานและรอรับ Response ส่งกลับไป

**Real Browsers**
เป็นตัวรัน Web Application จริงๆ โดย Selenium รองรับหลาย Browsers

### Quality Attribute Scenarios

#### Scenario 1: Performance

```
Source(Tester)
Stimulus(Test many web applications)
Artifacts(System)
Environment(Testing, Development)
Response(Parallel testing)
Response Measure(Time of testing)
```

#### Scenario 2: Integrability

```
Source(Developer)
Stimulus(Need to code with another language)
Artifacts(System)
Environment(Testing, Development)
Response(Developer can code with another language)
Response Measure(Developer use less time)
```

#### Scenario 3: Modifiability

```
Source(Developer)
Stimulus(change browser to test web application)
Artifacts(System)
Environment(Testing, Development)
Response(can change browser driver)
Response Measure(testing work well in new browser)
```

### References

https://www.w3.org/TR/webdriver1/
https://www.softwaretestingmaterial.com/selenium-webdriver-architecture/

---

## Audacity

Audacity เป็น Cross-platform audio software ใช้ในการอัดเสียง ตัดต่อเสียง ทำเอฟเฟคเสียงต่างๆ

### Architectural Patterns/Styles

![image](https://www.aosabook.org/images/audacity/Layers.png)

รูปแบบสถาปัตยกรรมที่ Audacity ใช้คือรูปแบบ
**Layer Architectural**

Layer ข้างบนเป็นส่วนของ UI ที่ติดต่อกับผู้ใช้งาน แสดงผล และรับคำสั่ง มีส่วนประกอบต่างๆ

Layer ล่าง เป็นส่วนที่ติดต่อกับ OS

### Quality Attribute Scenarios

#### Scenario 1: Usability

```
Source(User)
Stimulus(Want to record a sound)
Artifacts(System)
Environment(Runtime)
Response(The sound is recorded)
Response Measure(User's goal accomplishes in a few second)
```

#### Scenario 2: Modifiability

```
Source(Developer)
Stimulus(A directive to add export with a new sound format functionality)
Artifacts(Interfaces)
Environment(Runtime)
Response(Make modification)
Response Measure(Elapsed time < 2 hours)
```

#### Scenario 3: Integrability

```
Source(User)
Stimulus(Want to add plugin)
Artifacts(System)
Environment(Runtime)
Response(The plugin is added)
Response Measure(Elapsed time < 10 minutes)
```

### References

http://aosabook.org/en/audacity.html

---

## Yesod

Yesod เป็น open-source web framework เขียนด้วยภาษา Haskell ใช้ในการสร้าง web applications

### Architectural Patterns/Styles

![image](https://aosabook.org/images/yesod/overview.png)

รูปแบบสถาปัตยกรรมที่ Yesod ใช้คือรูปแบบ **MVC Architecture**

Model -> Database/Persistent

View -> Shakespeare

Controller -> Yesod app

### Quality Attribute Scenarios

#### Scenario 1: Testability

```
Source(Unit tester)
Stimulus(Validate system functions)
Artifacts(A unit of code)
Environment(A testing schedule)
Response(Perform a test)
Response Measure(90% path coverage in 15 minutes)
```

#### Scenario 2: Deployability

```
Source(Developer)
Stimulus(A new element is available to be deployed)
Artifacts(Specific components)
Environment(Full deployment)
Response(Deploy the new components)
Response Measure(Average/worst-case effort)
```

#### Scenario 3: Performance

```
Source(User request)
Stimulus(A periodic request arrives at a predictable interval)
Artifacts(Whole system)
Environment(Normal mode)
Response(System returns a response)
Response Measure(The variation in response time)
```

### References

http://aosabook.org/en/yesod.html
https://en.wikipedia.org/wiki/Yesod_(web_framework)
