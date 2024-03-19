package com.example.mvp.model

import com.example.mvp.model.domain.Wisdom

class FakeApiService {
    private val wisdomList = listOf<Wisdom>(
        Wisdom("ان تضيء شمعهصغيره خير لك من ان تنفق عمرك تلعن الظلام", "2020/1/2"),
        Wisdom("كلما ازدادت ثقافه المرء ازداد بؤسه", "2020/4/12"),
        Wisdom("سأل الممكن المستحيل اين تقيم؟ فأجابه في احلام العاجز ", "2020/1/2"),
        Wisdom("ان بيتا يخلو من كتاب فهو بيت بلا روح", "2020/8/8"),
        Wisdom("نحن لا نحصل عي السلام بالحرب انما بالتفاهم", "2021/1/1"),
        Wisdom("بعض الناس عظماء لان المحيطين بهم صغار", "2021/2/2"),
        Wisdom("عندما يمشي الكسل في الطريق فلابد ان يلحق به الفقر", "2021/10/9"),
        Wisdom("قليل من العلم مع العمل به انفع من كثير من العلم مع قله العمل به", "2020/1/2")
    )

    fun getRandomWisdom(): Wisdom {
        val random = (Math.random() * wisdomList.size).toInt()
        return wisdomList[random]
    }
}