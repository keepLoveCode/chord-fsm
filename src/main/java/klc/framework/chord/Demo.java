package klc.framework.chord;


/**
 * simple statemachine
 *
 * event
 *
 * currentState
 *
 * nextState
 *
 *
 * action
 *
 * @author grubby
 *
 *
 * 分析下多个版本得状态机实现
 *
 *
 * 1.级轻量级 https://github.com/shxz130/statemachine.git
 *
 *  1) stateMachine维护一个统一状态配置
 *  2）接收(状态&事件) 触发动作，handler定义是否流转状态 由context维护状态
 *
 *  不太行，状态机和状态机运行时没分离  action和 translate没分离
 *
 *
 * 2.uml state-machine design
 *
 *  behavioral state, behavioral transition
 *
 *  behavioral classifier (context) ->>> singal triggers & call triggers
 *
 *  evnent pool
 *
 *
 *  行为分类器持有状态机，并定义每个状态机得tigger和signal
 *
 *  vertex 顶点
 *
 *  state (entry, do, exit)
 *
 *  internal transition compartment>>>> guard condition
 *
 *  comosite state-> 状态可能存在子状态集,而子状态机 可能是相交（并行得）或不相交得(连续得)  连续并行的？
 *
 *
 *
 *  submachine state
 *
 *  region: region是一个组合状态或者一个状态机的正交区域。
 *  正交: 计算机上是，相互独立，可组合的
 *
 *  pseudostate 伪状态
 *
 *  initial pseudoState:
 *
 *  transition  external  internal  这两个都是相对于sourceState说的, 外是 target和source不一样，内是target和source一样
 *
 *              local:  如果触发，不会退出组合状态(source)，但是会退出并进入复合状态定义的其它状态
 *
 *
 *
 *
 *
 *
 *
 *
 */

/**
 * squirrel实现
 * <p>
 * stateMachineBuilder 定义stateMachine
 * <p>
 * stateMachineBuilderFactory
 * <p>
 * stateMachineBuilder ->  transitionBuilder(internal,local,external) entryExitActionBuilder
 * <p>
 * The internal state is implicitly built during transition creation or state action creation ???
 * <p>
 * 状态机实例共享配置信息
 * <p>
 * 状态机定义是采用懒加载，在第一次创建实例会加载。
 * <p>
 * 支持transitionAction
 * <p>
 * internalTransition Priority 内部转换优先级 action
 * <p>
 * condition transition  guard
 */
public class Demo {
}
