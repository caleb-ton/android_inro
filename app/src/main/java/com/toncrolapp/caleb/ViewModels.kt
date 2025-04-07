package com.toncrolapp.caleb

import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.toncrolapp.caleb.data.DashboardStat
import com.toncrolapp.caleb.data.QuickAction
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DashboardViewModel: ViewModel(){
    val _stats= MutableStateFlow(
        listOf(
            DashboardStat("Revenue","12000",Icon.Default.Person,Color.Magenta),
            DashboardStat("User","1456",Icon.Default.Person,Color.Cyan)
        )
    )
    val stat: StateFlow<List<DashboardStat>>get() = _stats
    private val _quickAction=MutableStateFlow(
        listOf(
            QuickAction("Add new user",Icon.Default.Person),
            QuickAction("Generate report",Icon.Default.AccountCircle),
            QuickAction("Setting",Icon.Default.settings),
        )
    )
    val quickAction: StateFlow<List<QuickAction>>get() = _quickAction
}