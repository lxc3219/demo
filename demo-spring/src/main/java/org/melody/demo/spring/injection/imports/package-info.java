/**
 * https://www.cnblogs.com/hermanlife/p/10019473.html
 * @import 只能用在类上，通过快速导入的方式实现把实例加入spring的IOC容器中
 * 3 种方式：
 * @import({clazzA.class,clazzB.class})
 *      这些在容器中bean名称是该类的全类名 ，比如com.yc.类名
 * @import(ImportSelector.class)
 *      返回需要导入的组件的全类名数组，springboot底层用的特别多【重点 】
 * @import(ImportBeanDefinitionRegistrar.class)
 *      ImportBeanDefinitionRegistrar：手动注册bean到容器
 */
package org.melody.demo.spring.injection.imports;